package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    private final String FIRST_LAST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,10}";
    Pattern pattern;

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_LAST_NAME_PATTERN);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = ((Matcher) matcher).matches();
        return result;
    }
}
