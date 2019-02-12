/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inclassassignment;

import java.util.Scanner;

/**
 *Class: CSC113
 * @author Rhomon Jackson
 * Purpose of program:
*/
public class Exercise2_6 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a  number between 0 and 1000: ");
    int num1 = input.nextInt();
    int firstExtract = num1%10;
    int secondExtract = (num1/10)%10;
    int thirdExtract = (num1/100)%10;
    int sum = firstExtract + secondExtract + thirdExtract;
    System.out.println("The sum of the digits is " + sum);
}
}
