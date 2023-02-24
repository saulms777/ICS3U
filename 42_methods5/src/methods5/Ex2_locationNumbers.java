/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 28 2022
 * Description: Exercise 2 - Location of Numbers
 */


package methods5;

import java.util.Scanner;
import java.lang.Math;

public class Ex2_locationNumbers {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * Gets the digits of a number at a specified index with length specified
     *
     * @param num Number to find digit from
     * @param place Index of digit starting from right
     * @param length Number of digits in number to search
     * @return <code>int</code> - Digits of returned number
     */
    private static int findDigit(int num, int place, int length) {
        return num % (int) Math.pow(10, place + length) / (int) Math.pow(10, place);
    }

    /**
     * Takes user input for the two numbers
     *
     * @return <code>int[]</code> - Integer array of number and digit
     */
    private static int[] userInput() {
        System.out.print("Number: ");
        int num1 = sc.nextInt();
        System.out.print("Digit: ");
        int num2 = sc.nextInt();
        return new int[]{num1, num2};
    }

    /**
     * Main method for program
     * <p>
     *     Repeats the following 10 times:<br>
     *     Takes user input for two numbers, and looks for the index at where the second number
     *     appears in the first. Index counting starts on the right and starts at 0.
     * </p>
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int[] inputs = userInput();
            found: {
                for (int j = 0; j <= (int) Math.log10(inputs[0]); j++) {
                    if (findDigit(inputs[0], j, (int) Math.log10(inputs[1]) + 1) == inputs[1]) {
                        System.out.printf("Location: %d\n", j + (int) Math.log10(inputs[1]));
                        break found;
                    }
                }
                System.out.println("Location: -1");
            }
        }
    }
}
