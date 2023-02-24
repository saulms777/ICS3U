/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 22 2022
 * Description: Exercise 4 - Code and Range
 */


package methods2;

import java.util.Scanner;

public class Ex4_codeRange {

    /**
     * Prints "OH NO!" if course code is not "ICS3U"
     *
     * @param code - course code to check
     */
    private static void courseCode(String code) {
        if (!code.equals("ICS3U")) {
            System.out.println("OH NO!");
        }
    }

    /**
     * Prints an expression for whether a number is between 5 and 25, inclusive
     * <p>
     *     <br>If number is between 5 and 25: "Number in range"
     *     <br>If number is not between 5 and 25: "Number out of range"
     * </p>
     *
     * @param num - number to check
     */
    private static void range(int num) {
        if (num >= 5 && num <= 25) {
            System.out.println("Number in range");
        } else {
            System.out.println("Number out of range");
        }
    }

    /**
     * Main method to run courseCode and range methods
     * <p>
     *     This method will take user input and run each of the above methods with the user inputs
     * </p>
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Course code: ");
            courseCode(sc.next());
            System.out.print("Number: ");
            range(sc.nextInt());
        }
    }

}
