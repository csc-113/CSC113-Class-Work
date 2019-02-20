
package fourinterger;

import java.util.Scanner;

/**
 *Class CSC113
 * @author Cecil Williams
 * Purpose of Program : To Find The Average of three numbers.
 */
public class SortingApp {
    //This programme finds the average of three numbers
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        
        //The Way to find average is would be to add up all the numbers and divide it by the quantity of numbers*
        
        System.out.print("Enter Your First Number");
        int num1= Input.nextInt();
        System.out.print("Enter Your Second Number");
        int num2= Input.nextInt();
        System.out.print("Enter Your Third Number");
        int num3=Input.nextInt();
        if (num1<num2 && num2<num3)
            System.out.println(num1 + "  " + num2 + "  " + num3);
        else if (num1<num3 && num3<num2)
            System.out.println (num1 + " " + num3 + " " + num2);
        else if (num2<num1 && num1<num3)
            System.out.println (num2+ " "+ num1 + " " + num3);
        else if (num2<num3 && num3<num1)
            System.out.println (num2 + " " + num3 + " " + num1);
        else if (num3<num1 && num1<num2)
            System.out.println (num3 + " " + num1 + " " + num2 + " ");
        else if (num3<num2 && num2<num1)
            System.out.println(num3 + " " + num2 + " " + num1 );
}
}