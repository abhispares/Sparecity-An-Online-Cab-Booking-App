package com.example.sparecityrider.Common;

import android.location.Location;

import com.example.sparecityrider.Remote.IFCMService;
import com.example.sparecityrider.Remote.FCMClient;

public class Common {
    public static final String  driver_tbl = "Drivers";
    public static final String  user_driver_tbl = "UsersInformation";
    public static final String  rider_driver_tbl = "RidersInformation";
    public static final String  pickup_request_tbl = "PickupRequest";
    public static final String  token_tbl = "Tokens";
    public static Location mLastLocation;


    public static final String fcmURL = "https://fcm.googleapis.com";

    public static IFCMService getFCMService(){
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }

}
