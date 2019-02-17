package theron.uberclonerider.Common;

import theron.uberclonerider.Remote.FCMClient;
import theron.uberclonerider.Remote.IFCMService;

public class Common {

    public static final String driver_tbl = "Drivers";
    public static final String user_driver_tbl = "DriversInformation";
    public static final String user_rider_tbl = "RidersInformation";
    public static final String pickup_request_tbl = "PickupRequest";
    public static final String token_tbl = "Tokens";

    public static final String fcmURL = "https://fcm.googleapis.com";
    public static IFCMService getFCMService()
    {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }
}

//Drivers => Table store information about Location of Driver available
//PickupRequest => Table store information about Pickup Request of User
//Riders => Table store information about User who register from Rider app
//Users => Table store information about Driver who register from Driver app
