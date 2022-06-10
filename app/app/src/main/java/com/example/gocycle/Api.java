package com.example.gocycle;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api {

    String OSRM_BASE_URL = "https://router.project-osrm.org/";
    String API_BASE_URL = "http://192.168.1.167:8080/";
    @GET("match/v1/driving/{coordinates}")
    Call<Match> getMatch(@Path("coordinates") String coordinates,
        @Query("annotations") boolean annotations,
        @Query("radiuses") String radiuses);

    @POST("nodes")
    Call<Match> postNodes(@Body List<Node> node);
}

