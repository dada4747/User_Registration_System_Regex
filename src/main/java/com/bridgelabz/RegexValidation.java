package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidation {
    String validFirstName = "^[A-Z]{1}[a-z]{2,}";
    public boolean validate(String firstName) {
        Pattern pattern = Pattern.compile((validFirstName));
        Matcher match = pattern.matcher(firstName);
        boolean result = match.matches();
        return result;

    }
}
