/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.st10451114poep1;

import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class ST10451114PoeP1 {

    public static void main(String[] args) {
        Scanner cs;
        cs = new Scanner(System.in);
        Registration myRegistratinObj = new Registration();

        // Check if the username is valid
        boolean isUsernameValid = myRegistratinObj.checkUsername(cs);
        String username = "";
        String password = "";

        if (isUsernameValid) {
            // Check the password
            boolean isPasswordValid = myRegistratinObj.checkPassword(cs);
            if (isPasswordValid) {
                // Capture username and password after validation
                username = myRegistratinObj.getUsername();  // Retrieve captured username
                password = myRegistratinObj.getPassword();  // Retrieve captured password

                // Collect first and last names for greeting purposes
                System.out.println("Enter First Name: ");
                String firstName = cs.next();

                System.out.println("Enter Last Name: ");
                String lastName = cs.next();

                // Attempt to log in with the registered credentials
                boolean isLoginSuccessful = Registration.loginUser(cs, username, password, firstName, lastName);

                // Output login result
                if (isLoginSuccessful) {
                    System.out.println("Login was successful.");
                } else {
                    System.out.println("Login failed. Please check your username and password.");
                }
            } else {
                System.out.println("Password validation failed.");
            }
        } else {
            System.out.println("Username validation failed.");
        }

        cs.close();  // Close the scanner
    }
}
