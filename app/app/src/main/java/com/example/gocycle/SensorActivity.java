package com.example.gocycle;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class SensorActivity extends Activity {

    SensorManager sm = null;
    TextView textView1 = null;
    List list;
    final float kFilteringFactor = 0.5f;
    static float rollingX=0, rollingY=0, rollingZ=0;

    SensorEventListener sel = new SensorEventListener(){
        public void onAccuracyChanged(Sensor sensor, int accuracy) {}
        public void onSensorChanged(SensorEvent event) {
            float[] values = event.values;

            // Calculate low pass values

            rollingX = (float) ((values[0] * kFilteringFactor) + (rollingX * (1.0 - kFilteringFactor)));
            rollingY = (float) ((values[1] * kFilteringFactor) + (rollingY * (1.0 - kFilteringFactor)));
            rollingZ = (float) ((values[2] * kFilteringFactor) + (rollingZ * (1.0 - kFilteringFactor)));

            // Subtract the low-pass value from the current value to get a simplified high-pass filter

            float accelX = values[0] - rollingX;
            float accelY = (values[1] - rollingY);
            float accelZ = values[2] - rollingZ;

            // Use the acceleration data.
            
            if(accelY > 5)
            {
                textView1.setBackgroundColor(Color.RED);
            }
            else
            {
                textView1.setBackgroundColor(Color.BLACK);
            }
            textView1.setText("Unfiltered\nx: "+values[0]+"\ny: "+values[1]+"\nz: "+values[2]+
                    "\nFiltered\nx: "+accelX+"\ny: "+accelY+"\nz: "+accelZ);

            String entry = values[0] + "," + values[1] + "," + values[2] + "\n"; //Unfiltered data
            String entry1 = accelX + "," + accelY + "," + accelZ + "\n"; //Filtered data
            try {

                File sdCard = Environment.getExternalStorageDirectory();
                File dir = new File(sdCard.getAbsolutePath() + "/gocycle");
                Boolean dirsMade = dir.mkdir();
                //System.out.println(dirsMade);
                System.out.println(dir.getAbsolutePath());
                Log.v("Accel", dirsMade.toString());

                File file = new File(dir, "unfiltered.csv");
                File file1 = new File(dir, "filtered.csv");
                FileOutputStream f = new FileOutputStream(file, true);
                FileOutputStream f1 = new FileOutputStream(file1, true);


                try {
                    f.write(entry.getBytes());
                    f1.write(entry1.getBytes());
                    f.flush();
                    f1.flush();
                    f.close();
                    f1.close();
                    Toast.makeText(getBaseContext(), "Data saved", Toast.LENGTH_LONG).show();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sensor);

        /* Get a SensorManager instance */
        sm = (SensorManager)getSystemService(SENSOR_SERVICE);

        textView1 = (TextView)findViewById(R.id.textView1);

        list = sm.getSensorList(Sensor.TYPE_ACCELEROMETER_UNCALIBRATED);
        if(list.size()>0){
            sm.registerListener(sel, (Sensor) list.get(0), SensorManager.SENSOR_DELAY_NORMAL);
        }else{
            Toast.makeText(getBaseContext(), "Error: No Accelerometer.", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onStop() {
        if(list.size()>0){
            sm.unregisterListener(sel);
        }
        super.onStop();
    }
}