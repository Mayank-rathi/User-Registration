package com.bridgelab.com.brigelabz.com;

import java.util.regex.Pattern;

public class UserValidation {
    private static final String FIRSTNAME = "^[A-Z]{1}[A-Za-z]{3,}$";

    public static boolean validateFirstName(String fname) {
        if (Pattern.matches(FIRSTNAME,fname) )
        {
            return true;
        }
        else {
            return false;
        }
    }
}
