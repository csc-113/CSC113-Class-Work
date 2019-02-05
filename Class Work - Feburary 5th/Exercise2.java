/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingexercisesone;

/**
 * CSC 113
 * @author Davindra O'Neal
 * Purpose of Program - To accept a radius and length of a cylinder and compute the 
 * area and volume and display them
 */
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cylinder's radius");
        double radius = input.nextDouble();
        System.out.println("Enter the cylinder's length");
        double length = input.nextDouble();
        double area =  radius*radius*3.1415;
        double volume = area*length;
        System.out.println("The area of this cylinder " + area + " and its volume is " + volume);
        
       
        
    }
}
