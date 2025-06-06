package ca.nl.cna.java2.streams;

import java.util.Scanner;

/**
 * Test some regular expressions
 *
 */
public class FunWithRegex {

    //New one googled in 2025
    public static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z0-9.-]+$";

    //The old one
    //public static final String EMAIL_REGEX = "^(.+)@(.+)$";

    public static void main(String[] args) {
        System.out.println("Fun with Regular Expressions");
        Scanner scanner = new Scanner(System.in);

        String email = "";

        do{

            System.out.println("Enter an email (Q to quit):");
            email = scanner.nextLine();

            if(isValidEmail(email)){
                System.out.println("ok Email: " + email);
            } else {
                System.out.println("INVALID Email: " + email);
            }


        } while (!email.equals("Q"));


    }

    public static boolean isValidEmail(String email){
        return email.matches(EMAIL_REGEX);
    }


}
