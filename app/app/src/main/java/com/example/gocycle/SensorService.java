package com.example.gocycle;

import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.LocationListener;
import android.os.Binder;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.osmdroid.bonuspack.utils.BonusPackHelper;
import org.osmdroid.bonuspack.utils.HttpConnection;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SensorService extends Service implements SensorEventListener {
    final float kFilteringFactor = 0.5f;
    static float rollingX=0, rollingY=0, rollingZ=0;
    protected String mUserAgent = "com.example.gocycle/1.0";
    List list;
    private static final String TAG = SensorService.class.getSimpleName();
    private SensorManager sm = null;
    /** Keeps track of all current registered clients. */
    ArrayList<Messenger> mClients = new ArrayList<Messenger>();
    /** Holds last value set by a client. */
    int mValue = 0;

    /**
     * Command to the service to register a client, receiving callbacks
     * from the service.  The Message's replyTo field must be a Messenger of
     * the client where callbacks should be sent.
     */
    static final int MSG_REGISTER_CLIENT = 1;

    /**
     * Command to the service to unregister a client, ot stop receiving callbacks
     * from the service.  The Message's replyTo field must be a Messenger of
     * the client as previously given with MSG_REGISTER_CLIENT.
     */
    static final int MSG_UNREGISTER_CLIENT = 2;

    /**
     * Command to service to set a new value.  This can be sent to the
     * service to supply a new value, and will be sent by the service to
     * any registered clients with the new value.
     */
    static final int MSG_SET_VALUE = 3;

    /**
     * Handler of incoming messages from clients.
     */
    class IncomingHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case MSG_REGISTER_CLIENT:
                    mClients.add(msg.replyTo);
                    break;
                case MSG_UNREGISTER_CLIENT:
                    mClients.remove(msg.replyTo);
                    break;
                case MSG_SET_VALUE:
                    mValue = msg.arg1;
                    for (int i = mClients.size() - 1; i >= 0; i--) {
                        try {
                            mClients.get(i).send(Message.obtain(null,
                                    MSG_SET_VALUE, mValue, 0));
                        } catch (RemoteException e) {
                            // The client is dead.  Remove it from the list;
                            // we are going through the list from back to front
                            // so this is safe to do inside the loop.
                            mClients.remove(i);
                        }
                    }
                    break;
                default:
                    super.handleMessage(msg);
            }
        }
    }

    /**
     * Target we publish for clients to send messages to IncomingHandler.
     */
    final Messenger mMessenger = new Messenger(new IncomingHandler());

    @Override
    public void onCreate() {
        // Display a notification about us starting.
        Toast.makeText(this, R.string.remote_service_started, Toast.LENGTH_SHORT).show();

        // Get a SensorManager instance
        sm = (SensorManager)getSystemService(SENSOR_SERVICE);

        list = sm.getSensorList(Sensor.TYPE_ACCELEROMETER_UNCALIBRATED);
        if(list.size()>0){
            sm.registerListener(this, (Sensor) list.get(0), SensorManager.SENSOR_DELAY_NORMAL);
            Toast.makeText(getBaseContext(), "Found Accelerometer.", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getBaseContext(), "Error: No Accelerometer.", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onDestroy() {
        // Tell the user we stopped.
        Toast.makeText(this, R.string.remote_service_stopped, Toast.LENGTH_SHORT).show();
    }

    /*
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // Get a SensorManager instance
        sm = (SensorManager)getSystemService(SENSOR_SERVICE);

        list = sm.getSensorList(Sensor.TYPE_ACCELEROMETER_UNCALIBRATED);
        if(list.size()>0){
            sm.registerListener(this, (Sensor) list.get(0), SensorManager.SENSOR_DELAY_NORMAL);
            Toast.makeText(getBaseContext(), "Found Accelerometer.", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getBaseContext(), "Error: No Accelerometer.", Toast.LENGTH_LONG).show();
        }

        return START_STICKY;
    }
     */


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mMessenger.getBinder();
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] values = sensorEvent.values;

        // Calculate low pass values

        rollingX = (float) ((values[0] * kFilteringFactor) + (rollingX * (1.0 - kFilteringFactor)));
        rollingY = (float) ((values[1] * kFilteringFactor) + (rollingY * (1.0 - kFilteringFactor)));
        rollingZ = (float) ((values[2] * kFilteringFactor) + (rollingZ * (1.0 - kFilteringFactor)));

        // Subtract the low-pass value from the current value to get a simplified high-pass filter

        float accelX = values[0] - rollingX;
        float accelY = (values[1] - rollingY);
        float accelZ = values[2] - rollingZ;

        // Use the acceleration data.
        String entry = values[0] + "," + values[1] + "," + values[2] + "\n"; //Unfiltered data
        String entry1 = accelX + "," + accelY + "," + accelZ + "\n"; //Filtered data

        //Log.e(TAG, entry1);

        if(accelY > 5)
        {
            Log.e(TAG, "Duobe");
            //getMatch("23.957570,54.905317;23.963235,54.904361", true);
            for (int i = mClients.size() - 1; i >= 0; i--) {
                try {
                    mClients.get(i).send(Message.obtain(null,
                            MSG_SET_VALUE, 1738, 0));
                } catch (RemoteException e) {
                    // The client is dead.  Remove it from the list;
                    // we are going through the list from back to front
                    // so this is safe to do inside the loop.
                    mClients.remove(i);
                }
            }
        }
    }
}