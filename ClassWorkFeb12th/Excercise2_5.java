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
 * Purpose of Program Exercise 2.5
 */
public class Excercise2_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the subtotal : ");
        int subTotal = input.nextInt();
        System.out.print("Please enter the gratuity rate : ");
        double gratuity = input.nextDouble();
        double gratRate = gratuity/100;
        double total = (subTotal*gratRate)+subTotal;
        System.out.println("The gratuity is $" + subTotal*gratRate + " making the total $" + total );
        
    }
}
