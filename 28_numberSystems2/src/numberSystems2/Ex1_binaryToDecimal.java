/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 2 2022
 * Description: Exercise 1 - Binary to Decimal
 */


package numberSystems2;

import java.util.Scanner;
import java.lang.Math;

public class Ex1_binaryToDecimal {

    public static void main(String[] args) {
        try (Scanner Input = new Scanner(System.in)) {
            System.out.print("Enter a binary number: ");
            int num = Input.nextInt();

            int sum = 0;
            for (int el = 0; el < (int) Math.log10(num) + 1; el++) {
                int digit = num % (int) Math.pow(10, el + 1) / (int) Math.pow(10, el);
                sum += Math.pow(2, el) * digit;
            }
            System.out.printf("Decimal number: %d", sum);
        }
    }
}
