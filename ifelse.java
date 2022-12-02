import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


/*
This program takes input form the user and checks if it is either even or odd and within a given range and finally
prints a statement.
*/


public class ifelse {

    // Declares a global scanner object for user input
    private static final Scanner scanner = new Scanner(System.in);

    // Main method
    public static void main(String[] args) {

        // Ask user for input
        System.out.println("Enter a number: ");

        // Store user input in N
        int N = scanner.nextInt();

        // Checks if N is an even number and if N is between 2 - 5
        if( N % 2 == 0 && N > 2 && N < 5){

            // Prints statement
            System.out.println("Not Weird");
        }

        // Checks if N is an even number and if N is between 6 - 20
        else if( N % 2 == 0 &&  N > 6 && N < 20){

            // Prints statement
            System.out.println("Weird");
        }

        // Checks if N is an even number and if N is greater 20
        else if( N % 2 == 0 && N > 20){
            System.out.println("Not Weird");
        }

        // Otherwise, if N is an odd number
        else {

            // Prints statement
            System.out.println("Weird");
        }

        // Closes scanner object
        scanner.close();
    }// main method
}// class
