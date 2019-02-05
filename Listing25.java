/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listing2.pkg5;

/**
 * Class CSC113
 * @author Davindra O'Neal
 * Purpose of Program This is Listing 2.5 on page 47, it prompts the user
 * to enter the time in  seconds and converts it to minutes and seconds */
import java.util.Scanner;
public class Listing25 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter an integer for seconds: ");
         int seconds = input.nextInt();
         int minutes = seconds / 60;
         int remainingSeconds = seconds % 60; 
         System.out.println(seconds + " seconds is " + minutes + 
         " minutes and " + remainingSeconds + " seconds");

    }

}
