/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 10 2022
 * Description: Exercise 1 - ABBA
 */


package strings3;

import java.util.Scanner;

public class Ex1_ABBA {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str1;
            do {
                System.out.print("Enter first string: ");
                str1 = sc.nextLine();
                if (!str1.equals("0")) {
                    System.out.print("Enter second string: ");
                    String str2 = sc.nextLine();
                    System.out.printf("%s %s %s %s\n", str1, str2, str2, str1);
                }
            } while (!str1.equals("0"));
            System.out.print("Goodbye");
        }
    }
}
