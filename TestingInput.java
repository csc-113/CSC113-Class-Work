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
      String firstName = input.nextLine(); // String are declared using "String"//When a scanner is accepting the input for a string you use nextLine
      System.out.println("What is your last name?");
      String lastName = input.nextLine(); //Declaire the variable lastName whilst also declaring that it will accept the next input 
      System.out.println("You are " + firstName + " " + lastName );
      
      
              
    }
    
}
