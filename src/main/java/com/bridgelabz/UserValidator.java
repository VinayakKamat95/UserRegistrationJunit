package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    //*Regex Pattern to Check First Name
    // 1st Later caps and minimum 3 chars*//
    private final String FIRST_LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,10}";
    //*Regex Pattern to Check Email*//
    private final String EMAIL_PATTERN = "^[a-z]+[.]{1}[a-z]*@[a-z]{2}[.]{1}[co]+[.]?[a-z]{0,2}$";
    Pattern pattern;

    //*Method to validate first name
    // taking pattern as regex string and matcher as first name parameter to check
    // result in boolean format if match true else false
    // return this result back to FirstNameTest.java*//
    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_LAST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = ((Matcher) matcher).matches();
        return result;
    }

    //*Method to validate last name
    // taking pattern as regex string and matcher as last name parameter to check
    // result in boolean format if match true else false
    // return this result back to LastNameTest.java*//
    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(FIRST_LAST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = ((Matcher) matcher).matches();
        return result;
    }

    //*Method to validate email
    // taking pattern as regex string and matcher as email parameter to check
    // result in boolean format if match true else false
    // return this result back to EmailTest.java *//
    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        boolean result = ((Matcher) matcher).matches();
        return result;
    }
}
