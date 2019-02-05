package programmingexercisesone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Class CSC113
 * @author Davindra O'Neal
 * Purpose of Program - To accept a temperature in Celsius and convert it to 
 * Celsius
 */
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the temperature in Celsius");
    double celsius = input.nextDouble();
    double fahrenheit = (9.0/5) * celsius + 32;
    System.out.println("The temperature in Fahrenheit is " + fahrenheit );
    }
    
}
