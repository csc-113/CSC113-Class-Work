/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise5_1;

import java.util.Scanner;

/**
 * Class CSC113
 * @author Davindra O'Neal
 * Purpose Of Program - Exercise 5.1 
 * Its reads an unspecified number of integers, determines how many
   positive and negative values have been read, and computes the total and average of
   the input values (not counting zeros). The program ends once a zero is entered.
 */
public class Exercise5_1 {

   public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       //Declare Variables
        float total = 0;
        float average = 0;
        int totalPositive = 0;
        int totalNegative = 0;
        int number = 1; // number is intialized as 1 in the begining so that the loop begins
        float count = 0;
        //While loop
        while (number != 0){ // This loop is primarily utilized to accept a undetermined number of inputs.
            number = 0;
           
            System.out.println("Please enter a number, entering 0 to end the sequence : ");
            number = input.nextInt();
            if (number !=0){ // this is done because if the 0 is counted the value of count would throw off the average.
            ++count;
            }
            if (number > 0 ){ // if the number is positve the value of totalPostive increases by 1
                ++totalPositive;
            }
            else if (number < 0){ // If the number is negative the value of totalNegative increases by 1
                ++totalNegative; 
            }
            total = total + number; //this makes total the value of the previous iterations total plus the entered number
            average = total/count; 
            
        }
        //Print outputs
        System.out.println("The number of positives is " + totalPositive + ".");
        System.out.println("The number of negativess is " + totalNegative + ".");
        System.out.println("The total is " + total + ".");
        System.out.println("The average is " + average + ".");
    }

}
