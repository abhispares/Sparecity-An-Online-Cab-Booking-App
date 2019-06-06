package com.example.sparecity.Remote;

import com.example.sparecity.Model.DataMessage;
import com.example.sparecity.Model.FCMResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key = AAAA94kMMrI:APA91bFIQ21gzxIqt_tJM0b2B6fhfM_UBAfQ_B_vfU60g8F4vrvyOejREnoul5zvx1hXddSn6fssKUewP8oQn_EHU0znC219FOMRUa1XVOLtkaIF28lYngLcHNPp03udJTlP9sCGxkZX"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body DataMessage body);
}
