package com.eocean.ivr.util.values;

public class AuthConstants {

    private AuthConstants(){}

    public static final String KEY_STATUS = "status";
    public static final String KEY_DATA = "data";
    public static final String KEY_ERROR = "error";
    public static final String KEY_ACCESS_TOKEN = "access_token";
    public static final String ERROR_TYPE_INVALID_GRANT = "invalid_grant";
    public static final String ERROR_TYPE_INVALID_USER_CREDENTIALS = "invalid_user_credentials";
    public static final String REGISTRATION_SUCCESSFUL = "User registered successfully.";
    public static final String VERIFICATION_EMAIL_SENT = "Verification email is sent, please check your inbox at : ";
    public static final String FORGOT_PASSWORD_VERIFICATION = "Change password one time code is sent on your email and phone number. Please verify your password change request by using it.";
    public static final String VERIFICATION_OTP_SENT = "OTP is sent, verification token is :";
    public static final String EDIT_PROFILE_SUCCESSFUL = "Your profile have been edited successfully, login again to continue";
    public static final String DELETED_SUCCESSFULLY = " deleted successfully";
    public static final String EDITED_SUCCESSFULLY = " edited successfully";
    public static final String CHANGE_PASSWORD_SUCCESS = " Password changed successfully";
    public static final String LOGOUT_SUCCESS = " Logout successfully";
    public static final String CANNOT_BE_DELETED = "cannot be deleted";
    public static final int STATUS_SUCCESS = 0;
    public static final int STATUS_INVALID_PIN = 1;
    public static final int STATUS_UNEXPECTED_ERROR = -1;
}
