package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidation {
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]{1,}[.]{0,1}[a-zA-Z0-9]{0,}+@[a-zA-Z0-9]+.[a-zA-Z]{2,3}[.]{0,1}[a-zA-Z]{0,}";
    private static final String MOBILE_NO_PATTERN = "^[0-9]{0,2}[ ][0-9]{10}";
    private static final String PASSWORD_PATTERRN = "^(?=.*[0-9])"+"(?=.*[a-z])(?=.*[A-Z])"+ "(?=.*[@\\-#$%^&+=])"+ "(?=\\S+$).{8,}$";
    private static final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
    public boolean validateFirstName(String firstName) {
        return patternChecker(firstName, NAME_PATTERN);
    }
    public boolean validateLastName(String lastName){
        return patternChecker(lastName, NAME_PATTERN);
    }
    public boolean validateEmailId(String emailId) {
        return patternChecker(emailId, EMAIL_PATTERN);
    }
    public boolean validatePassword(String password){
        return patternChecker(password, PASSWORD_PATTERRN);
    }
    private static boolean patternChecker(String input, String fieldPattern){
        Pattern pattern = Pattern.compile(fieldPattern);
        Matcher matcher = pattern.matcher(input);
        boolean result = matcher.matches();
        return result;
    }


    public boolean validateMobilNumber(String mobileNumber) {
        return patternChecker(mobileNumber,MOBILE_NO_PATTERN);
    }
}
