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
 * Purpose of Program To demonstrate the use of a boolean
 */
public class BooleanDemo {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the integer : ");
        int demoNum = input.nextInt();
        if ((demoNum % 5) == 0) //Compares if  the demoNum is divisiable by 5 without remainder
            System.out.println("HiFive!");
        else if ((demoNum % 2) == 0) // If the number is not divisible by 5 withouth remainder, it checks if it is divisible by 2 without
            System.out.println("HiEven!");
        else 
            System.out.println("This gets noting");
        
            
            
    }
}
