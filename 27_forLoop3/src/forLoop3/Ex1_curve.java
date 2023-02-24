/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 31 2022
 * Description: Exercise 1 - Curve
 */

package forLoop3;

import java.util.Scanner;

public class Ex1_curve {

    public static void main(String[] args) {
        try (Scanner Input = new Scanner(System.in)) {
            System.out.print("Minimum value of domain: ");
            int min = Input.nextInt();
            System.out.print("Maximum value of domain: ");
            int max = Input.nextInt();
            System.out.print("Increment value: ");
            int step = Input.nextInt();

            for (int el = min; el <= max; el += step) {
                System.out.printf("(%d, %d)\n", el, el * el * el - 3);
            }
        }
    }
}
