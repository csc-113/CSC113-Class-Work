package testinginput;

/**
 * 
 * @author Davindra O'Neal
 * Purpose of Program - To accept a users first and last name and print them
 */

import java.util.Scanner; //Imports the scanner utility to create a new scanner to accept input
public class TestingInput {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("What is your first name?");
      String firstName = input.next(); // String are declared using "String"//When a scanner is accepting the input for a string no datatype needs to be specified.
      System.out.println("What is your last name?");
      String lastName = input.next();
      System.out.println("You are " + firstName + " " + lastName );
      
      
              
    }
    
}
