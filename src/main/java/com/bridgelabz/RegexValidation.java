package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidation {
    final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
    public boolean validateFirstName(String firstName) {
        return patternChecker(firstName, NAME_PATTERN);

    }
    public boolean validateLastName(String lastName){
        return patternChecker(lastName, NAME_PATTERN);

    }
    private static boolean patternChecker(String input, String fieldPattern){
        Pattern pattern = Pattern.compile(fieldPattern);
        Matcher matcher = pattern.matcher(input);
        boolean result = matcher.matches();
        return result;
    }
}
