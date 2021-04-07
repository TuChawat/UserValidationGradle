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

}
