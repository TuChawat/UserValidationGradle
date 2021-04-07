package com.bridgelabz.userregistration;
import java.lang.String;

public class UserValidationProcess {
    public boolean validateFirstName(String name) {
        String pattern = "^([A-Z]{1})([a-z]{2,})$";
        if (name.matches(pattern))
            return true;
        else
            return false;
    }

    public boolean validateLastName(String name) {
        String pattern = "^([A-Z]{1})([a-z]{2,})$";
        if (name.matches(pattern))
            return true;
        else
            return false;
    }

    public boolean validEmail(String email) {
        String pattern = "^[a-zA-Z0-9]+([.+-_][a-zA-Z0-9]+)*@[a-zA-z0-9]+.[a-zA-Z]{2}([.][a-zA-Z]{2,4}){0,1}$";
        if (email.matches(pattern))
            return true;
        else
            return false;
    }

    public boolean validMobileNo(String MobileNo) {
        String pattern = "^([0-9]{2})[ ]([1-9]{1}[0-9]{9})$";
        if (MobileNo.matches(pattern))
            return true;

        else
            return false;
    }

    public boolean validPassword(String Password) {
        String pattern = "^([a-zA-Z0-9]{8,})$";
        if (Password.matches(pattern))
            return true;

        else
            return false;
    }

    public boolean validPasswordAtleastOneUpperCase(String Password) {
        String pattern = "^(.*[A-Z]{1}[A-Za-z0-9]{7,})$";
        if (Password.matches(pattern))
            return true;

        else
            return false;
    }

    public boolean validateAlteastOneNumber(String password) {
        String pattern = "^(.*[A-Z]{1,}[0-9]{1,}[A-Za-z0-9]{6,})$";
        if (password.matches(pattern))
            return true;

        else
            return false;
    }

    public boolean validSpecialChar(String password) {
        String pattern =  "^(.*[A-Z]{1,}.*[0-9]{1,}.*[~!@#$%^&*]?[A-Za-z0-9]{5,})$";
        if (password.matches(pattern))
            return true;

        else
            return false;
    }

    public String analyseMode(String message) {
        if (message.contains("SAD"))
            return "SAD";
        else
            return "HAPPY";
    }

}
