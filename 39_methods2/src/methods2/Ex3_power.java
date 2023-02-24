/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 22 2022
 * Description: Exercise 3 - Power Method
 */


package methods2;

import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Ex3_power {

    /**
     * Checks if integer is positive
     *
     * @param num Integer to check if positive
     * @return <code>boolean</code> - true if num is positive else false
     */
    private static boolean isPositive(int num) {
        return num > 0;
    }

    /**
     * Calculates and prints the power of a integer to another integer
     *
     * @param base - Positive integer for base of power method
     * @param exp - Positive integer for exponent of power method
     * @return <code>boolean</code> - true if both parameters were positive else false
     */
    private static boolean power(int base, int exp) {
        if (isPositive(base) && isPositive(exp)) {
            System.out.printf("%d to the power of %d = %d\n", base, exp, (int) Math.pow(base, exp));
            return true;
        }
        return false;
    }

    /**
     * Prints a random farewell statement
     *
     * <p>
     *     The three possible farewell statements are as follows:
     *     <br>1. Goodbye.
     *     <br>2. Have a nice day.
     *     <br>3. Program executed successfully.
     * </p>
     */
    private static void randomFarewell() {
        Random rand = new Random();
        switch (rand.nextInt(3)) {
            case 0 -> System.out.println("Goodbye.");
            case 1 -> System.out.println("Have a nice day.");
            case 2 -> System.out.println("Program executed successfully.");
        }
    }

    /**
     * Main method to calculate exponents
     *
     * <p>
     *     This method will take user input for base and exponent and calculate the power function using the inputs.
     *     A random farewell message is then displayed.
     *     The method will continue to do so until a negative number is entered.
     * </p>
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1;
            int num2;
            boolean loop;
            do {
                System.out.print("Base: ");
                num1 = sc.nextInt();
                System.out.print("Exponent: ");
                num2 = sc.nextInt();
                loop = power(num1, num2);
                if (loop) {
                    randomFarewell();
                }
            } while (loop);
        }
    }

}
