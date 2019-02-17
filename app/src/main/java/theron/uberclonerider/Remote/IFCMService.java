package theron.uberclonerider.Remote;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import theron.uberclonerider.Model.FCMResponse;
import theron.uberclonerider.Model.Sender;


public interface IFCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAAmW4qrlw:APA91bEW9ImXnSvn7q0c0cowUcNExpcKVh8NlUK_oZQGMbpA_fgMNvsceZCKljHPmrsdMx_8EG_f0rT1nfsgayUUcMpqcJLiwe-sgEJb9uUPcoTzK_SiJBh7rKzCgFHPkS6K-AcRrZ1Z"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}

