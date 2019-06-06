package com.example.sparecity.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit = null;

    public static Retrofit getClient(String baseURl){
        if(retrofit == null)
        {
            retrofit = new Retrofit.Builder()
                            .baseUrl(baseURl)
                            .addConverterFactory(ScalarsConverterFactory.create())
                            .build();
        }
        return retrofit;
    }
}
