package utility;

/**
 * Class CSC113
 *
 * @author Davindra O'Neal Purpose of Class - A Class containing common methods
 * that are often used or needed
 */
public class Utility {
//    Loop Format for processing 2D Arrays 
//    for (int row = 0; row < arr.length; row++) {
//            for (int column = 0; column < arr[row].length; column++) {
//                
//            }
//        }
    
    
    //Method Name - flatArrayPrint
    //Purpose of Method - recive and array and print it 
    //Input - a one dimensional array
    //Output - void

    public static void flatArrayPrint(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    //make the datatype variations as needed 

    //Method Name - flat2DArrayPrint
    //Purpose of Method - recive and array and print it 
    //Input - a two  dimensional array
    //Output - void        
    public static void flat2DArrayPrint(double[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.println(arr[row][column]);
            }
        }
    }

    //Method Name - populateArray
    //Purpose of Method - populate a one dimensional array
    //Input - an empty array, a low and a high value
    //Output - an array filled with values between the low value and the high value
    public static double[] populateArray(double[] arr, double lowValue, double highValue) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * ((highValue - lowValue) + 1)) + lowValue;
        }
        return arr;
    }

    //Method Name - populate2DArray
    //Purpose of Method - populate a 2D array
    //Input - an empty 2D array, a low value and a high value
    //Output -  a 2D array populated with values between the low value and the high value
    public static double[][] populate2DArray(double[][] arr, double lowValue, double highValue) {
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = (int) (Math.random() * ((highValue - lowValue) + 1)) + lowValue;
            }
        }
        return arr;
    }

    //Method Name - findArrayMaximum
    //Purpose of Method - sorts through the Array to find the maximum value
    //Input - a populated array
    //Output - the highest value of the array
    public static double findArrayMaximum(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    //Method Name - totalOfArray
    //Purpose of Method - adds all of the values within the array and returns the total
    //Input - a populated array
    //Output - the total value of the array
    public static double totalOfArray(double[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
    
    //Method Name - totalOf2DArray
    //Purpose of Method - adds of the the values withing a 2D array and returns the totla
    //Input - a pupulated 2D array
    //Output - the toatl value of the 2D array
    public static double totalOf2DArray(double[][] arr){
        double total = 0;
        
   for (int row = 0; row < arr.length; row++) {
           for (int column = 0; column < arr[row].length; column++) {
               total+=arr[row][column];
           }
       }
   return total;
    }

    //Method Name - findArrayAverage
    //Purpose of Method - sorts through an array to find the average value
    //Input - a populated array
    //Output - the average value
    public static double findArrayAverge(double[] arr) {
        return (arr.length / totalOfArray(arr));
    }

    //Method Name - findArrayMinimum
    //Purpose of Method - sorts through the array to find the minimum value
    //Input - a populated array
    //Output - the lowest value of the array
    public static double findArrayMinimum(double[] arr) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //Method Name - add
    //Purpose of Method - adds two variables and returns the sum
    //Input - two numerical values
    //Output - the sum of the two numerical values
    public static double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    //Method Name - subract 
    //Purpose of Method - subtracts two variables and returns the difference
    //Input - two numerical values
    //Output - the difference of the two numerical values
    public static double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    //Method Name - evenCheck
    //Purpose of Method - recieves a numerical value and returns if its even or not
    //Input - a numerical value
    //Output - a boolean value
    public static boolean evenCheck(double numberToCheck) {
        boolean isEven = (numberToCheck % 2 == 0);
        return isEven;
    }

    //Method Name - oddCheck
    //Purpose of Method - recieves a numerical value and returns its odd or not 
    //Input - a numerical value
    //Output - a boolean value
    public static boolean oddCheck(double numberToCheck) {
        boolean isOdd = (numberToCheck % 2 != 0);
        return isOdd;
    }



}

