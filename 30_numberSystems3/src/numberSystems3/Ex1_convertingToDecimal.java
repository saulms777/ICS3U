/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 2 2022
 * Description: Exercise 1 - Converting to Decimal
 */


package numberSystems3;

import java.util.Scanner;
import java.lang.Math;

public class Ex1_convertingToDecimal {
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
                System.out.print("Enter a base (2 to 10): ");
                base = Input.nextInt();
            } while (base < 2 || base > 10);

            if (base == 10) {
                System.out.print("No conversion required");
                return;
            }

            System.out.print("Enter a number: ");
            int num = Input.nextInt();

            System.out.printf("The decimal number is: %d\n", converter(num, base));
        }
    }
}
