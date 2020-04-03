package com.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    UserRegistration userRegObject = new UserRegistration(); // Object
    // UC:1
    @Test
    public void givenValidFirstName_shouldReturnTrue() {
        boolean firstName=userRegObject.validation("Arati");
        Assert.assertTrue(firstName);
    }
    @Test
    public void givenFirstName_whenMinimumThreeCharacter_shouldReturnTrue() {
        boolean firstName = userRegObject.validation("Ari");
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

    //  UC:2
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

    //  UC:3
    @Test
    public void givenEmailId_whenProper_shouldReturnTrue() {
        boolean emailId = userRegObject.emailValidation("aratiupare31@gmail.com");
        Assert.assertTrue(emailId);
    }

    @Test
    public void givenEmailId_whenContainSymbol_shouldReturnTrue() {
        boolean emailId = userRegObject.emailValidation("arati#upare@gmail.com");
        Assert.assertTrue(emailId);
    }

    @Test
    public void givenEmailId_whenContainLessThanThreeCharacter_shouldReturnFalse() {
        boolean emailId = userRegObject.emailValidation("ar@gmail.com");
        Assert.assertFalse(emailId);
    }

    @Test
    public void givenEmailId_whenNotContainGmailPart_shouldReturnFalse() {
        boolean emailId = userRegObject.emailValidation("arat@.com");
        Assert.assertFalse(emailId);
    }

    @Test
    public void givenEmailId_whenNotContainComPart_shouldReturnFalse() {
        boolean emailId = userRegObject.emailValidation("arati@gmail");
        Assert.assertFalse(emailId);
    }
}
