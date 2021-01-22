package com.eocean.ivr.util;

import org.springframework.util.StringUtils;

public class Utilities {

    public static String cleanPhoneNumber(String rawPhoneNumber) {
        if (StringUtils.isEmpty(rawPhoneNumber)) return null;
        String phoneNumber = StringUtils.trimLeadingCharacter(rawPhoneNumber.replaceAll("[^\\d]", ""), '0');
        if (phoneNumber.length() == 12 && phoneNumber.startsWith("923")) {
            return "+" + phoneNumber;
        }
        if (phoneNumber.length() == 11 && phoneNumber.startsWith("03")) {
            return phoneNumber.replaceFirst("03", "+923");
        }
        if (phoneNumber.length() == 10 && phoneNumber.startsWith("3")) {
            return phoneNumber.replaceFirst("3", "+923");
        }
        return null;
    }




    public static String generateAPIKey(String email, String password){
        org.apache.commons.codec.binary.Base64 base64Url = new org.apache.commons.codec.binary.Base64(true);
        String keyToConvert  = email.concat("||").concat(password);
        return base64Url.decode(keyToConvert).toString();
    }


}
