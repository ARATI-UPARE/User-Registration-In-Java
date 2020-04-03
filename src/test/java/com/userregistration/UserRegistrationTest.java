package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    UserRegistration userRegObject = new UserRegistration(); // Object
    // UC2
    @Test
    public void givenValidLastName_shouldReturnTrue() {
        boolean lastName=userRegObject.validation("Upare");
        Assert.assertTrue(lastName);
    }
    @Test
    public void givenLastName_whenMinimumThreeCharacter_shouldReturnTrue() {
        boolean lastName = userRegObject.validation("Upa");
        Assert.assertTrue(lastName);
    }

    @Test
    public void givenInvalidLastName_shouldReturnFalse() {
        boolean lastName=userRegObject.validation("U");
        Assert.assertFalse(lastName);
    }
    @Test
    public void givenLastName_whenAllLowerCaseCharacter_shouldReturnFalse(){
        boolean lastName = userRegObject.validation("upare");
        Assert.assertFalse(lastName);
    }

    @Test
    public void givenLastName_whenAllUpperCaseCharacter_shouldReturnFalse() {
        boolean lastName = userRegObject.validation("UPARE");
        Assert.assertFalse(lastName);
    }

    @Test
    public void givenLastName_whenContainNumber_shouldReturnFalse() {
        boolean lastName = userRegObject.validation("Upa452");
        Assert.assertFalse(lastName);
    }
}
