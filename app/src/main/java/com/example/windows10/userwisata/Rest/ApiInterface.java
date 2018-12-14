package com.example.windows10.userwisata.Rest;

import com.example.windows10.userwisata.Model.GetWisata;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("wisata/all")
    Call<GetWisata> getWisata
            (
                    @Field("username") String username,
                    @Field("password") String password);
}
