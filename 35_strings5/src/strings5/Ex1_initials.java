/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 14 2022
 * Description: Exercise 1 - Initials
 */


package strings5;

import java.util.Scanner;

public class Ex1_initials {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String first;
            do {
                System.out.print("Enter first name: ");
                first = sc.next();
                if (!first.equals("exit")) {
                    System.out.print("Enter last name: ");
                    String last = sc.next();
                    System.out.printf("Your full name is %s %s, %c.%c.\n", first, last, first.charAt(0), last.charAt(0));
                }
            } while (!first.equals("exit"));
            System.out.print("Goodbye");
        }
    }
}
