package com.bridgelab.com.brigelabz.com;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {

    @Test
    public void giveFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidation.validateUserName("Mayank");
        Assert.assertEquals(true, result);
    }

    @Test
    public void giveFirstName_WhenUnProper_ShouldReturnFalse()
    {
        boolean result = UserValidation.validateUserName("mayank");
        Assert.assertEquals(false,result);
    }

    @Test
    public void giveLastName_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidation.validateUserName("Rathi");
        Assert.assertEquals(true,result);
    }

    @Test
    public void giveLastName_WhenUnProper_ShouldReturnFalse()
    {
        boolean result = UserValidation.validateUserName("rathi");
        Assert.assertEquals(false,result);
    }
    @Test
    public void giveEmail_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidation.validateEmail("abc-100@yahoo.com");
        Assert.assertEquals(true, result);
    }
    @Test
    public void giveEmail_WhenUnProper_ShouldReturnFalse()
    {
        boolean result = UserValidation.validateEmail("mayankRathi.com");
        Assert.assertEquals(false,result);
    }

    @Test
    public void giveMobile_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidation.validateMobile("91 8888045245");
        Assert.assertEquals(true, result);
    }
    @Test
    public void giveMobile_WhenUnProper_ShouldReturnFalse()
    {
        boolean result = UserValidation.validateMobile("888880465245");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givePasswordWithAtLeastEightCaseLatter_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidation.validatePassword1("Mayankrathiiii");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givePasswordWithAtLeastEightCaseLatter_WhenUnProper_ShouldReturnFalse()
    {
        boolean result = UserValidation.validatePassword1("rathi");
        Assert.assertEquals(false,result);
    }
}