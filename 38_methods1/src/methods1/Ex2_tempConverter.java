/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 21 2022
 * Description: Exercise 2 - Temperature Converter
 */


package methods1;

import java.util.Scanner;

public class Ex2_tempConverter {

    private static int fToC(int f) {
        return (f - 32) * 5 / 9;
    }

    private static int cToF(int c) {
        return c * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Temperature: ");
            int temp = sc.nextInt();
            System.out.print("Unit of temperature (f/c): ");
            if (sc.next().equals("f")) {
                System.out.printf("Temperature in celsius: %d", fToC(temp));
            } else {
                System.out.printf("Temperature in fahrenheit: %d", cToF(temp));
            }
        }
    }

}
