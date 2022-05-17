package com.example.gocycle;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class NearestService {
    @GET("/nearest/v1/driving/")
    Call<Nearest> doGetNearestList(@Query("page") String page);
}
