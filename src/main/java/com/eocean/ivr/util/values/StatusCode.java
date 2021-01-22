package com.eocean.ivr.util.values;

public class StatusCode {

    public static final int SUCCESS = 0;

    public static final int ERROR = 400;
    public static final int NOT_FOUND = 404;
    public static final int ALREADY_EXISTS = 409;
    public static final int SOMETHING_UNEXPECTED_HAPPENED = 500;
    public static final int UNAUTHORIZED = 403;
    public static final int OK = 200;
    public static final int CREATED = 201;

    public static final int PARSING_ERROR = 7000;
    public static final int USER_AUTH_USER_EXISTS = 1003;
    public static final int USER_AUTH_NEW_USER = 1004;
    public static final int FORGOT_PASSWORD_OTP_SENT = 1005;
    public static final int FORGOT_PASSWORD_OTP_VERIFIED = 1010;
    public static final int USER_PRE_AUTH_TOKEN_NOT_VALID = 1006;
    public static final int WRONG_PASSWORD = 1007;
    public static final int USER_CREATED_BUT_COULD_NOT_LOGIN = 1008;
    public static final int OLD_APP_VERSION = 1009;
    public static final int USER_LOGGED_IN_FROM_ANOTHER_DEVICE = 1014;
    public static final int BETA_HAS_ENDED = 1015;
}

