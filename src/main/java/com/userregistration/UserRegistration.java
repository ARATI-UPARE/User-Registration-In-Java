package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    String regPattern = "^[A-Z][a-z]{2,}$";
    String emailPattern = "^([a-z]{2,}[0-9a-z]{1,}([_+-.*$#]{0,1}[a-z0-9]{1,}){0,1}[@]{1}[a-z0-1]{1,}[.]{1}[a-z]{2,4}([.]{0,1}[a-z]{2}){0,1})$";
    String mobNoPattern= "^[0-9]{2}\\s[0-9]{10}$";
    String passwordPattern="^(?=.*[A-Z])[A-Za-z0-9@#$%&*]{8,}$";  //Rule-2:

    public  boolean validation(String name) {  // First name Last name validation

            return Pattern.matches(regPattern,name);
    }

    public boolean emailValidation(String email) { // Email validation

        return Pattern.matches(emailPattern, email);
    }

    public boolean validateMobNumber(String mobileNumber){    // Mobile number validation

        return Pattern.matches(mobNoPattern,mobileNumber);
    }

    public boolean validatePassword(String password){   // Password validation

        return  Pattern.matches(passwordPattern,password);
    }
}
