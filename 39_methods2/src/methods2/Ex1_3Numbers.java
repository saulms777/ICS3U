/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 22 2022
 * Description: Exercise 1 - 3 Numbers
 */


package methods2;

import java.util.Scanner;
import java.lang.Math;

public class Ex1_3Numbers {

    /**
     * Prints the minimum of three integers
     *
     * @param n1 First number
     * @param n2 Second number
     * @param n3 Third number
     */
    private static void min(int n1, int n2, int n3) {
        System.out.printf("Smallest number: %d\n", Math.min(Math.min(n1, n2), n3));
    }

    /**
     * Prints the average of three integers
     *
     * @param n1 First number
     * @param n2 Second number
     * @param n3 Third number
     */
    private static void average(int n1, int n2, int n3) {
        System.out.printf("Average: %.2f\n", (n1 + n2 + n3) / 3.0);
    }

    /**
     * Prints the number of vowels in a word
     *
     * @param str Word to search for number of vowels
     */
    private static void vowels(String str) {
        int count = 0;
        for (char letter : str.toCharArray()) {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                count++;
            }
        }
        System.out.printf("Number of vowels: %d\n", count);
    }

    /**
     * Main method to get user input and run methods
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter three numbers:");
            min(sc.nextInt(), sc.nextInt(), sc.nextInt());
            System.out.println("Enter three numbers:");
            average(sc.nextInt(), sc.nextInt(), sc.nextInt());
            System.out.print("Enter a word: ");
            vowels(sc.next());
        }
    }

}
