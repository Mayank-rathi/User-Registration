package com.bridgelab.com.brigelabz.com;

import org.junit.Assert;
import org.junit.Test;

import static com.bridgelab.com.brigelabz.com.UserValidation.PASSWORD1;

public class UserRegistrationTest {

    @Test
    public void giveFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidation.validateUserName("Mayank");
        Assert.assertEquals(true, result);
    }

    @Test
    public void giveFirstName_WhenInProper_ShouldReturnFalse() {
        boolean result = UserValidation.validateUserName("mayank");
        Assert.assertEquals(false, result);
    }

    @Test
    public void giveLastName_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidation.validateUserName("Rathi");
        Assert.assertEquals(true, result);
    }

    @Test
    public void giveLastName_WhenInProper_ShouldReturnFalse() {
        boolean result = UserValidation.validateUserName("rathi");
        Assert.assertEquals(false, result);
    }

    @Test
    public void giveEmail_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidation.validateEmail("abc-100@yahoo.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void giveEmail_WhenInProper_ShouldReturnFalse() {
        boolean result = UserValidation.validateEmail("mayankRathi.com");
        Assert.assertEquals(false, result);
    }

    @Test
    public void giveMobile_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidation.validateMobile("91 8888045245");
        Assert.assertEquals(true, result);
    }

    @Test
    public void giveMobile_WhenInProper_ShouldReturnFalse() {
        boolean result = UserValidation.validateMobile("888880465245");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givePasswordWithAtLeastEightCaseLatter_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidation.validatePassword("Mayankrathiiii", UserValidation.PASSWORD1);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givePasswordWithAtLeastEightCaseLatter_WhenUnProper_ShouldReturnFalse() {
        boolean result = UserValidation.validatePassword("rathi", UserValidation.PASSWORD1);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givePasswordWithAtLeastOneUpperCaseLatterAndEightCharacters_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidation.validatePassword("iiiiiiiihjH", UserValidation.PASSWORD2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givePasswordWithAtLeastOneUpperCaseLatterAndEightCharacters_WhenUnProper_ShouldReturnFalse() {
        boolean result = UserValidation.validatePassword("rathi", UserValidation.PASSWORD2);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givePasswordWithAtLeastOneUpperCaseLatterAndEightCharactersAndOneDigit_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidation.validatePassword("MAEEMAYANK33", UserValidation.PASSWORD3);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givePasswordWithAtLeastOneUpperCaseLatterAndEightCharactersAndOneDigit_WhenUnProper_ShouldReturnFalse() {
        boolean result = UserValidation.validatePassword("rathi", UserValidation.PASSWORD3);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givePasswordWithAtLeastOneUpperCaseLatterAndEightCharactersAndOneDigitAndOneSpecialCharacter_WhenProper_ShouldReturnTrue() {
        boolean result = UserValidation.validatePassword("MAEEMAYANK33@", UserValidation.PASSWORD4);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givePasswordWithAtLeastOneUpperCaseLatterAndEightCharactersAndOneDigitAndOneSpecialCharacter_WhenUnProper_ShouldReturnFalse() {
        boolean result = UserValidation.validatePassword("rathi", UserValidation.PASSWORD4);
        Assert.assertEquals(false, result);

    }
}