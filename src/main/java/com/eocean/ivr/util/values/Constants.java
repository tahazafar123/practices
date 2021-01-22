package com.eocean.ivr.util.values;

public class Constants {

    public static final String MNP_SERVICE_URL = "http://52.220.203.204/hlr-controller/getCarrier";
    public static final String MNP_API_KEY = "[B@25f860c1";
    public static final String DEVICE_TEMPORARILY_LOCKED = "Device is temporarily locked please try again in a while.";
    public static final String DEVICE_NOT_VERIFIED = "Cannot Verify Phone Number";
    public static final String SOMETHING_UNEXPECTED_HAPPENED = "Something unexpected happened, Please try again or contact customer support.";
    public static final String USER_NOT_FOUND_WITH_PHONE_NO = "User not found with Phone number, %s";
    public static final String INVALID_OTP = "Invalid OTP!";
    public static final String EMAIL_NOT_FOUND = "Email not Found";

    public static final String MESSAGE_TEXT_NOT_OK = "MESSAGE TEXT NOT OK";

    public static final String NUMBER_NOT_FOUND = "Number not found or number is locked, please try again.";
    public static final String NUMBER_ALREADY_FOUND = "Number already exist, Login to proceed.";
    public static final String PRE_AUTH_TOKEN_INVALID = "Token is in-Valid.";

    public static final String WATCHLIST_ADDED= "Symbol successful ADDED to WatchList";
    public static final String WATCHLIST_DELETE= "Symbol successful DELETE to WatchList";
    public static final String DATA_NOT_FOUND= "DATA not found";

    public static final String PARAMETERS_NOT_OK = "Provided parameters do not match with required type parameter ";



    private Constants(){}

    public static final int DEVICE_LOCK_TIME_IN_MINUTES = 30;
    public static final int OTP_RETRY_LIMIT = 3;
    public static final int TOKEN_RETRY_LIMIT = 3;
    public static final int PAGE_SIZE = 100;
    public static final int DEFAULT_DUE_DATE = 15;
    public static final int TRUMP_YEAR = 1804;
    public static final int TOKEN_START_INDEX = 25;
    public static final int TOKEN_END_INDEX = 126;
    public static final int QR_CODE_WIDTH = 400;
    public static final int QR_CODE_HEIGHT = 400;

    public static final String DATE_FORMAT = "yyyy-MM-dd";


    public static final String KEY_IS_SUCCESSFUL = "is_successful";
    public static final String KEY_DATA = "data";
    public static final String KEY_ERROR = "error";
    public static final String ENV_LOCAL = "local";
    public static final String ENV_DEV = "dev";
    public static final String ENV_QA = "qa";
    public static final String ENV_PROD = "prod";

    public static final String DEFUALT_ERROR = "Request can not process";


    //SMS API CONSTANT INTERNATIONAL
    public static final String API_USERNAME_INTER = "";
    public static final String API_PASSWORD_INTER ="MNhb45PO" ;
    public static final String API_PORT_INTER = "24555";
    public static final String API_MESSAGE_INTER = " " ;
    public static final String API_SENDER_INTER = "99095";
    public static final String API_URL_INTER = "http://smsc001.eocean.us:24555/api?action=sendmessage&username=";

    //SMS API CONSTANT INTERNATIONAL
    public static final String API_USERNAME_CALL = "";
    public static final String API_PASSWORD_CALL ="";
    public static final String API_CODE_CALL = "";
    public static final String API_URL_CALL = "";
}

