package com.bridgelabz;
import java.util.Scanner;

public class Validator {
    Scanner sc = new Scanner(System.in);

    RegexValidation regexValidation = new RegexValidation();
    public String firstName() {
        System.out.println();
        System.out.println("Enter First Name:");
        String firstName = sc.nextLine();
        boolean result = regexValidation.validateFirstName(firstName);
        if (result) {
            System.out.println("Name is valide");
            return firstName;
        }else {
            System.out.println("Name is not valide, Enter Correct Name");
        return firstName();
        }
    }
    public String lastName(){
        System.out.println("Enter Last Name:");
        String lastName = sc.nextLine();
        boolean result = regexValidation.validateLastName(lastName);
        if (result) {
            System.out.println("Last Name is valide");
            return lastName;
        }else {
            System.out.println("Last Name is not valide, Enter Correct Name");
            return lastName();
        }
    }
}
