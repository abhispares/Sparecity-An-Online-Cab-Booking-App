package com.example.sparecity.Common;

import android.location.Location;

import com.example.sparecity.Model.User;
import com.example.sparecity.Remote.IFCMService;
import com.example.sparecity.Remote.IGoogleAPI;
import com.example.sparecity.Remote.RetrofitClient;

public class Common {

    public static final String  driver_tbl = "Drivers";
    public static final String  user_driver_tbl = "UsersInformation";
    public static final String  rider_driver_tbl = "RidersInformation";
    public static final String  pickup_driver_tbl = "PickupRequest";
    public static final String  token_tbl = "Tokens";

    public static Location mLastLocation = null;
    public static User currentUser;


    public static final String baseURL = "https://maps.googleapis.com";
    public static final String fcmURL = "https://fcm.googleapis.com";
    public static IGoogleAPI getGoogleAPI(){
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }
    public static IFCMService getFCMService(){
        return RetrofitClient.getClient(fcmURL).create(IFCMService.class);
    }
}
