/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janahomework22;

import java.util.Scanner;

/**
 *
 * @author janam
 */
public class JanaHomework22 {
    // Get user's input from keyboard
    public static String getUserInput(Scanner s) {
        return s.nextLine();
    }
    
    // Is that a decimal?
    public static boolean isDecimal(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    //Is that between 0 and 100?
    public static boolean isBetween0and100(Double num) {
        if (num >= 0 && num <= 100) {
            return true;
        }

        return false;
    }
    
    //Calculate the percentage
    public static Double calculateGrade(Double number) {
        return ((number / 100 * 20));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String userInput;
        Double userInputAsDouble;
        Double grade;

        // scanner to get user input
        Scanner myKB = new Scanner(System.in);
        System.out.println("Please, enter your mark");

        // get user input from the keyboard
        userInput = getUserInput(myKB);

        // needs to be a decimal to continue with the program
        if (!isDecimal(userInput)) {
            System.out.println("Invalid input");
            System.exit(1);
        }

        // string (decimal) => double
        userInputAsDouble = Double.parseDouble(userInput);

        // printing a message in case the numer is negative or greater than 100
        if (!isBetween0and100(userInputAsDouble)) {
            System.out.println("Invalid input, your mark must be between 0 and 100");
            System.exit(1);
        }

        // calculate user grade
        grade = calculateGrade(userInputAsDouble);
        System.out.println("You scored " + grade + "% out of a maximum of 20%");
    }

}

