package com.bridgelab.com.brigelabz.com;

import org.junit.Assert;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

public class UserRegistration {
    @Test
    public void giveFirstName_WhenProper_ShouldReturnTrue() {
        UserValidation validation = new UserValidation();
        boolean result = validation.validateFirstName("Mayank");
        Assert.assertEquals(true, result);
    }

    @Test
    public void giveFirstName_WhenUnProper_ShouldReturnFalse()
    {
        UserValidation validation = new UserValidation();
        boolean result = validation.validateFirstName("mayank");
        Assert.assertEquals(false,result);
    }

    @Test
    public void giveLastName_WhenProper_ShouldReturnTrue() {
        UserValidation validation = new UserValidation();
        boolean result = validation.validateFirstName("Mayankrathi");
        Assert.assertEquals(true, result);
    }

    @Test
    public void giveLastName_WhenUnProper_ShouldReturnFalse()
    {
        UserValidation validation = new UserValidation();
        boolean result = validation.validateFirstName("may");
        Assert.assertEquals(false,result);
    }

}