/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 14 2022
 * Description: Exercise 3 - Replace
 */


package strings5;

import java.util.Scanner;

public class Ex3_replace {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the original string: ");
            String str = sc.nextLine();
            System.out.print("Enter letter to replace: ");
            String letter = sc.next();
            System.out.printf("Modified string is: %s", str.replaceAll(letter, "\\$"));
        }
    }
}
