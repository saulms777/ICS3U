/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 2 2022
 * Description: Exercise 3 - Conversion
 */


package numberSystems2;

import java.util.Scanner;
import java.lang.Math;

public class Ex3_conversion {
    static int converter(int input, int type) {
        int sum = 0;
        for (int el = 0; el < (int) Math.log10(input) + 1; el++) {
            int digit = input % (int) Math.pow(10, el + 1) / (int) Math.pow(10, el);
            if (digit < type) {
                sum += Math.pow(type, el) * digit;
            } else {
                sum = -1;
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner Input = new Scanner(System.in)) {
            int base;
            do {
                System.out.print("Enter a number: ");
                int num = Input.nextInt();
                System.out.print("Enter a base: ");
                base = Input.nextInt();

                System.out.printf("Number in decimal: %d\n", converter(num, base));
            } while (base != 0);
        }
    }
}
