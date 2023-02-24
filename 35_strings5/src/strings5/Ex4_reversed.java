/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 14 2022
 * Description: Exercise 4 - Reversed
 */


package strings5;

import java.util.Scanner;

public class Ex4_reversed {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the original string: ");
            String str = sc.nextLine();
            System.out.print("The string reversed: ");
            for (int el = str.length(); el > 0; el--) {
                System.out.print(str.charAt(el - 1));
            }
        }
    }
}
