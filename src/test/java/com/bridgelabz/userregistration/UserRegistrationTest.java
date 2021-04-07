package com.bridgelabz.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserValidationProcess userValidationProcess = new UserValidationProcess();

    @Test
    public void givenFirstName_WhenFirstNameStartsWithCapitalLetter_ShouldReturn_True() {

        boolean result = userValidationProcess.validateFirstName("Tushar");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenFirstNameInLowerCase_ShouldReturn_false() {

        boolean result = userValidationProcess.validateFirstName("tushar");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenFirstNameStartHaveMinThreeLetters_ShouldReturn_True() {

        boolean result = userValidationProcess.validateFirstName("Tus");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenFirstNameStartWithLessThanThreeLetters_ShouldReturn_False() {

        boolean result = userValidationProcess.validateFirstName("tu");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenLastName_WhenLastNameStartsWithCapitalLetter_ShouldReturn_True() {

        boolean result = userValidationProcess.validateLastName("Chawat");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenLastNameInLowerCase_ShouldReturn_false() {

        boolean result = userValidationProcess.validateLastName("chawat");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenLastNameStartHaveMinThreeLetters_ShouldReturn_True() {

        boolean result = userValidationProcess.validateLastName("Cha");
        Assertions.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenLastNameStartWithLessThanThreeLetters_ShouldReturn_False() {

        boolean result = userValidationProcess.validateLastName("ch");
        Assertions.assertFalse(result);
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {

        boolean result = userValidationProcess.validEmail("abc.xyz@bl.co.in");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenMobNumber_WhenProper_ShouldReturnTrue() {

        boolean result = userValidationProcess.validMobileNo("91 9689887638");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenMobNumber_WhenDifferent_ShouldReturnFalse() {

        boolean result = userValidationProcess.validMobileNo("91 968988B638");
        Assertions.assertEquals(false, result);

    }

    @Test
    public void givenPasswordRule1_WhenProper_ShouldReturnTrue() {

        boolean result = userValidationProcess.validPassword("jdhuihjn");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {

        boolean result = userValidationProcess.validPasswordAtleastOneUpperCase("jdFuifjn");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {

        boolean result = userValidationProcess.validateAlteastOneNumber("jdF5iOj8");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenPasswordRule4_WhenProper_ShouldReturnFalse() {

        boolean result = userValidationProcess.validSpecialChar("Eyu6@uyh");
        Assertions.assertEquals(false, result);
    }
}
