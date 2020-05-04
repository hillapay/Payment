package ir.hillapay.pay.sdk;



public interface HillaPayUnSubscribeUserListener {

    void onResult(boolean unSubscribe);

    void onFailed(String message, @HillaErrorType int errorType);

}
