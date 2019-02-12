/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classworkfeb12;

import java.util.Scanner;

/**
 * Class   CSC113
 * @author Davindra O'Neal
 * Purpose of Program Exercise 2.6
 */
public class Exercise2_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number between 0 and 1000 : ");
        int number = input.nextInt();
        int extractOne = number%10;
        int extractTwo = (number/10)%10;
        int extractThree = (number/100)%10;
        int sumOfdigits = extractOne + extractTwo + extractThree;
        System.out.println("The sum of the digits is " + sumOfdigits);
        
    }
}
