package com.prince.friend.hijridate;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.prince.friend.hijridate.models.Welcome;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    JsonPlaceHolder jsonPlaceHolder;
    TextView date,weekday,hijrimonth,hijridate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        date = findViewById(R.id.date);
        weekday = findViewById(R.id.weekday);
        hijridate = findViewById(R.id.hijridate);
        hijrimonth = findViewById(R.id.hijrimonth);

        jsonPlaceHolder = API.getRetrofit().create(JsonPlaceHolder.class);

        // you can pass current month and year
        Call<Welcome> call = jsonPlaceHolder.getHijriDate(11,2021);
        call.enqueue(new Callback<Welcome>() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onResponse(Call<Welcome> call, Response<Welcome> response) {

                Welcome welcome = response.body();
                assert welcome != null;

//                for(int i=0 ; i<welcome.getData().size() ; i++){
//
//                }
                // this will eturn a list so you need to do this using recycler view
                // but i'm getting only second item
                date.setText("Today Date: "+welcome.getData().get(1).getGregorian().getDate());
                weekday.setText("WeekDay : "+welcome.getData().get(1).getGregorian().getWeekday().getEn());
                hijridate.setText("Hijri Date : "+welcome.getData().get(1).getHijri().getDate());
                hijrimonth.setText("Hijri Month : "+welcome.getData().get(1).getHijri().getMonth().getAr());

            }

            @Override
            public void onFailure(Call<Welcome> call, Throwable t) {

            }
        });

    }
}