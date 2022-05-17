package com.example.gocycle;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "https://router.project-osrm.org/";
    @GET("nearest/v1/driving/")
    Call<List<Nearest>> getNearest();
}

