package com.example.gocycle;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api {

    String BASE_URL = "https://router.project-osrm.org/";
    @GET("match/v1/driving/{coordinates}")
    Call<Match> getMatch(@Path("coordinates") String coordinates,
        @Query("annotations") boolean annotations);
}

