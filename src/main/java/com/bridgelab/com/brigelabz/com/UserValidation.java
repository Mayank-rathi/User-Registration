package com.bridgelab.com.brigelabz.com;

import java.util.regex.Pattern;

public class UserValidation {
    public static void main(String[] args) {
        System.out.println("Weclome To User Registration");
    }
    private static final String USERNAME = "^[A-Z]{1}[A-Za-z]{3,}$";
    private static final String EMAIL = "^[a-zA-Z]{1}[a-zA-Z0-9]*([-.+_]{1}[a-zA-Z0-9]+)?[@]{1}[a-zA-Z0-9]+[.]{1}[a-z]{2,4}([.][a-z]{2,3})?";
    private static final String MOBILE = "^[1-9]{1,3}[ ][1-9]{1}[0-9]{9}$";

    public static boolean validateUserName(String uname) { return Pattern.matches(USERNAME,uname); }
    public static boolean validateEmail(String email) { return Pattern.matches(EMAIL,email); }
    public static boolean validateMobile(String mobile) { return Pattern.matches(MOBILE,mobile); }



}
