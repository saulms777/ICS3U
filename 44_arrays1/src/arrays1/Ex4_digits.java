/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 29 2022
 * Description: Exercise 4 - Digits
 */


package arrays1;

import java.util.Scanner;

public class Ex4_digits {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] count = new int[10];
            System.out.print("Enter a number: ");
            String num = sc.next();
            for (char digit : num.toCharArray()) {
                count[digit - '0'] += 1;
            }
            for (int i = 0; i < count.length; i++) {
                System.out.printf("%d - %d times\n", i, count[i]);
            }
        }
    }

}
