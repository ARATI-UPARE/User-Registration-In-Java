package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    String regPattern = "^[A-Z][a-z]{2,}$";
    public  boolean validation(String name) {

            return Pattern.matches(regPattern,name);
    }
}
