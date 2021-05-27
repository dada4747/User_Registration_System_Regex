package com.bridgelabz;
import java.util.Scanner;

public class Validator {
    Scanner sc = new Scanner(System.in);

    RegexValidation regexValidation = new RegexValidation();
    public String firstName() {
        System.out.println();
        System.out.println("Enter First Name:");
        String firstName = sc.nextLine();
        boolean result = regexValidation.validate(firstName);
        if (result) {
            System.out.println("Name is valide");
            return firstName;
        }else {
            System.out.println("Name is not valide, Enter Correct Name");
        return firstName();
        }
    }
}
