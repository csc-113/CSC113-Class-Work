/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inclassassignment;

/**
 * class Csc 113 
 * professor Colin A. Cousins
 * @author Giovanni N. Wells 
 * 
 */
public class Addnumber {
    public static void main(String[] args) {
       
        double x = 4;
        double y = 5;
        double z = 7; 
        double answer= number(x,y,z);
        
       System.out.format("%.2f your annswer is ", answer);
    }
    public static double number(double num1, double num2, double num3) {
        return num1+num2+num3;
        
    }
}
