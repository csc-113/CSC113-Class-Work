/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classworkfeb14;

import java.util.Scanner;

/**
 * Class   CSC113
 * @author Davindra O'Neal
 * Purpose of Program Accept a number and perform a number of Boolean Operations
 * 
 */
public class Boolean_OperatorsIF {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.print("Please enter your number : ");
        int number = input.nextInt();
        //Amd Operator 
        if ((number % 2 == 0)&&(number % 3 == 0))
            System.out.println( number + " is divisble by 2 and 3.");
        
            
        //Or Operator 
        if ((number % 2 == 0)||(number % 3 == 0))
            System.out.println( number + " is divisble by 2 or 3.");
       
            
        //Exclusive Or Operator 
        if ((number % 2 == 0)^(number % 3 == 0))
            System.out.println( number + " is divisble by 2 or 3, but not both.");
       
            

        
        
        
    }

}
