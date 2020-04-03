package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    UserRegistration userRegObject = new UserRegistration(); // Object
    // UC1
    @Test
    public void givenValidFirstName_shouldReturnTrue() {
        boolean firstName=userRegObject.validation("Arati");
        Assert.assertTrue(firstName);
    }
    @Test
    public void givenFirstName_whenMinimumThreeCharacter_shouldReturnTrue() {
        boolean firstName = userRegObject.validation("Pri");
        Assert.assertTrue(firstName);
    }

    @Test
    public void givenInvalidFirstName_shouldReturnFalse() {
        boolean firstName=userRegObject.validation("Ar");
        Assert.assertFalse(firstName);
    }
    @Test
    public void givenFirstName_whenAllLowerCaseCharacter_shouldReturnFalse(){
        boolean firstName = userRegObject.validation("arati");
        Assert.assertFalse(firstName);
    }

    @Test
    public void givenFirstName_whenAllUpperCaseCharacter_shouldReturnFalse() {
        boolean firstName = userRegObject.validation("ARATI");
        Assert.assertFalse(firstName);
    }

    @Test
    public void givenFirstName_whenContainNumber_shouldReturnFalse() {
        boolean firstName = userRegObject.validation("Ara452");
        Assert.assertFalse(firstName);
    }
}
