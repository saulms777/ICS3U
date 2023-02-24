/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 31 2022
 * Description: Exercise 5 - Pattern
 */


package forLoop3;

import java.util.Scanner;
import java.lang.Math;

public class Ex5_pattern {

    public static void main(String[] args) {
        try (Scanner Input = new Scanner(System.in)) {
            int num;
            do {
                do {
                    System.out.print("Number greater than 0: ");
                    num = Input.nextInt();
                } while (num < 0);

                StringBuilder spaces = new StringBuilder();
                for (int el1 = num; el1 > 0; el1--) {
                    System.out.printf("%s", spaces);
                    for (int el2 = el1; el2 > 0; el2--) {
                        System.out.print(el2);
                    }
                    spaces.append(" ".repeat((int) Math.log10(el1) + 1));
                    System.out.println();
                }
            } while (num != 0);
        }
    }
}
