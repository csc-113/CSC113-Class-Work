package exercise5_2;

import java.util.Scanner;

/**
 * Class CSC113
 * @author Davindra O'Neal
 * Purpose of Program A derivative of a program meant to generate 5 random
 * subtraction questions. This version generates 10 addition questions using numbers from 1 to 15
 */
public class Exercise5_2 {
    public static void main(String[] args) {
        final int numberOfquestions = 10; // Number of questions
        int correctCount = 0; // Count the number of correct answers
        int count = 0; // Count the number of questions
        long startTime = System.currentTimeMillis();
        String output = " "; // output string is initially empty
        Scanner input = new Scanner(System.in);
        
        while (count < numberOfquestions) {
            //Generate two numbers between 1 and 15
            int number1 = (int)(Math.random() * 15 + 1);
            int number2 = (int)(Math.random() * 15 + 1);
            
            
            //Prompt user with the question
            System.out.println("What is " + number1 + " + " + number2 + "? ");
            //Accept the user's answer
            int answer = input.nextInt();
            
            //Check to see if the answer is correct
            if (number1 + number2 == answer){
                System.out.println("You are correct!");
                correctCount++;
            }
            else {
                System.out.println("Your answer is wrong.\n" + number1 + " + " + number2 + " should be " + (number1 + number2));
            }
            //Increase the question count by 1
            count++;
            
            output += "\n" + number1 + "+" + number2 + "=" + answer + ((number1 + number2 == answer) ? " correct" : " wrong");
        }

           long endTime = System.currentTimeMillis();
           long testTime = endTime - startTime;
           
           //Final outputs
           System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + " seconds\n" + output);


        }
    }


