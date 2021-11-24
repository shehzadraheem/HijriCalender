package com.prince.friend.hijridate;

import com.prince.friend.hijridate.models.Welcome;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JsonPlaceHolder {
    //hToG

//    @GET("hToG")
//    Call<Welcome> getHijriDate();

    @GET("gToHCalendar/{month}/{year}")
    Call<Welcome> getHijriDate(@Path("month")int month,
                               @Path("year") int year);
}
