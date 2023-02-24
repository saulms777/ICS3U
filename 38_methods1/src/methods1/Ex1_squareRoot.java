/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 21 2022
 * Description: Exercise 1 - Square Root
 */


package methods1;

import java.util.Scanner;
import java.lang.Math;

public class Ex1_squareRoot {

    private static double squareRoot(int num) {
        return Math.sqrt(num);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            System.out.printf("Square root: %.2f", squareRoot(sc.nextInt()));
        }
    }

}
