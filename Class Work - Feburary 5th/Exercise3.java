/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingexercisesone;

import java.util.Scanner;

/**
 *  Class CSC113
 * @author Davindra O'Neal
 * Purpose of Program - To accept a number in feet and converts it to meters and
 * displays the result
 */
public class Exercise3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length in feet");
        double feet = input.nextDouble();
        double meters = feet*0.305;
        System.out.println(feet + " feet is " + meters + " meters");
    }
}
