package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    //*Regex Pattern to Check First Name
    // 1st Later caps and minimum 3 chars*//
    private final String FIRST_LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,10}";
    Pattern pattern;

    //*Method to validate first name
    // taking pattern as regex string and matcher as first name parameter to check
    // result in boolean format if match true else false
    // return this result back to FirstNameTest.java*//
    public boolean validateFirstLastName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_LAST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = ((Matcher) matcher).matches();
        return result;
    }
}
