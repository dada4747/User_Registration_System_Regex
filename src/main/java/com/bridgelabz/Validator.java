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
    public String emailId(){
        System.out.println("Enter email id :");
        String emailId = sc.nextLine();
        boolean result = regexValidation.validateEmailId(emailId);
        if(result) {
            System.out.println("Email Address is valid");
            return emailId;
        }
        else {
            System.out.println("Email Address is not valid , Enter correct Email Adress");
            return emailId();
        }
    }
    public String mobileNumber() {
        System.out.println("Enter Mobile Number");
        String mobileNumber = sc.nextLine();
        boolean result = regexValidation.validateMobilNumber(mobileNumber);
        if(result) {
            System.out.println("Mobile Number is valid");
            return mobileNumber;
        }
        else {
            System.out.println("Mobile Number is not valid , Enter correct Phone N");
            return mobileNumber();
        }
    }
    public String password() {
        System.out.println("Enter password");
        String password = sc.nextLine();
        boolean r = regexValidation.validatePassword(password);
        if(r) {
            System.out.println("Password is valid");
            return password;
        }
        else {
            System.out.println("Password is not valid , Enter correct Password");
            return password();
        }
    }

    public void choice() {
        while (true) {
            System.out.println("Enter option to check for Validation");
            System.out.println("1. First Name");
            System.out.println("2. Last Name");
            System.out.println("3. Email");
            System.out.println("4. Mobile Number");
            System.out.println("5. Password");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();

            switch (option) {
                case 1:
                   firstName();
                    break;
                case 2:
                    lastName();
                    break;
                case 3:
                    emailId();
                    break;
                case 4:
                    mobileNumber();
                    break;
                case 5:
                    password();
                    break;
                case 0:
                    return;
            }
        }
    }
}
