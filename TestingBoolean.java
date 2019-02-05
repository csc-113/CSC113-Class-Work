
package testingboolean;

/**
 *
 * @author Davindra O'Neal
 */
import java.util.Scanner;
public class TestingBoolean { // a boolean is a datatype that can only be either true or false
    public static void main(String[] args) {
        //The result of a comparison is a boolean value
        //for example
        double radius = 1;
        System.out.println(radius > 0); // this will print "true" since the comparison is true
        // here is something more interactive
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number, if it is larger than 20 the computer will print true, if not it will print false!");
        int number = input.nextInt();
        System.out.println(number > 20);
       
    }
    
}
