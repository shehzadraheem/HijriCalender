package com.prince.friend.hijridate;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class API {

    public static Retrofit instance;

    public static Retrofit getRetrofit(){
        if(instance==null){
            //http://api.aladhan.com/v1/gToHCalendar/8/2016
           // http://api.aladhan.com/v1/
            instance = new Retrofit.Builder().baseUrl("http://api.aladhan.com/v1/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return instance;
    }
}
