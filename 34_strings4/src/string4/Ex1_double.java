/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 11 2022
 * Description: Exercise 1 - Double
 */


package string4;

import java.util.Scanner;

public class Ex1_double {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str;
            do {
                System.out.print("Enter string: ");
                str = sc.nextLine();

                if (!str.equals("Exit")) {
                    for (int el = 0; el < 2 * str.length(); el++) {
                        System.out.print(str.charAt(el / 2));
                    }
                    System.out.println();
                }
            } while (!str.equals("Exit"));
            System.out.print("Goodbye");
        }
    }
}
