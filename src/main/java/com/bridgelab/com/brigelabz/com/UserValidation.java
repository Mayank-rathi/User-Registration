package com.bridgelab.com.brigelabz.com;

import java.util.regex.Pattern;

public class UserValidation {
    public static void main(String[] args) {
        System.out.println("Weclome To User Registration");
    }
    private static final String USERNAME = "^[A-Z]{1}[A-Za-z]{3,}$";
    public static boolean validateFirstName(String fname) {
        if (Pattern.matches(USERNAME,fname) )
        {
            return true;
        }
        else {
            return false;
        }
    }

}
