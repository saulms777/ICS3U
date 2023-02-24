/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 23 2022
 * Description: Exercise 4 - isDigit
 */


package methods3;

import java.util.Scanner;

public class Ex4_isDigit {

    /**
     * Checks if a character is a number or not
     *
     * @param character Character to check if digit
     * @return <code>boolean</code> - True if character is digit else false
     */
    private static boolean isDigit(char character) {
        return '0' <= character && character <= '9';
    }

    /**
     * Finds the sum of all numbers in a given String
     *
     * @param str String to find sum of numbers
     * @return <code>int</code> - Sum of the numbers in str
     */
    private static int sum(String str) {
        int sum = 0;
        for (char letter : str.toCharArray()) {
            if (isDigit(letter)) {
                sum += letter - '0';
            }
        }
        return sum;
    }

    /**
     * Main method for program
     * <p>
     *     Takes user input for a phrase and outputs the sum of the numbers in the phrase
     * </p>
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("String input: ");
            System.out.printf("Sum of digits: %d", sum(sc.nextLine()));
        }
    }

}
