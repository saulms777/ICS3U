/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 15 2022
 * Description: Exercise 2 - Decimal to Binary String
 */


package strings6;

import java.util.Scanner;

public class Ex2_decimalToBinaryString {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num;
            do {
                System.out.print("Enter a decimal number: ");
                num = sc.nextInt();
            } while (num < 0);

            StringBuilder str = new StringBuilder();
            System.out.print("The binary number is: ");
            while (num != 0) {
                if (num % 2 == 1) {
                    str.append("1");
                } else {
                    str.append("0");
                }
                num /= 2;
            }
            for (int el = str.length(); el > 0; el--) {
                System.out.print(str.charAt(el - 1));
            }
        }
    }
}
