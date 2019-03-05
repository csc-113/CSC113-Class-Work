package classworkmarch3;

/**
 * Class CSC113
 * @author Davindra O'Neal
 * Purpose of Program - Add 3 Doubles and produce the sum,
 * rounded to two decimal places
 */
public class AddNumber {
    public static void main(String[] args) {
    double num1 = 20;
    double num2 = 21;
    double num3 = 22;
    double result = add(num1, num2, num3);
    
        System.out.format("The result is %.2f\n", result);
        
    }
    public static double add(double num1, double num2, double num3){
        
        
        return num1 + num2 + num3;
     
        
    }
}
