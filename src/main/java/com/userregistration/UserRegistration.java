package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    String regPattern = "^[A-Z][a-z]{2,}$";
    String emailPattern = "^([a-z]{2,}[0-9a-z]{1,}([_+-.*$#]{0,1}[a-z0-9]{1,}){0,1}[@]{1}[a-z0-1]{1,}[.]{1}[a-z]{2,4}([.]{0,1}[a-z]{2}){0,1})$";

    public  boolean validation(String name) {

            return Pattern.matches(regPattern,name);
    }

    public boolean emailValidation(String email) {

        return Pattern.matches(emailPattern, email);
    }
}
