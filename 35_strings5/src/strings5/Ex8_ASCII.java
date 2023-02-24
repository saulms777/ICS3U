/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 14 2022
 * Description: Exercise 8 - ASCII
 */


package strings5;

import java.util.Scanner;

public class Ex8_ASCII {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str;
            do {
                System.out.print("Enter a string: ");
                str = sc.nextLine();
                if (!str.equals("exit")) {
                    for (int el = 0; el < str.length(); el++) {
                        System.out.printf("%d ", (int) str.charAt(el));
                    }
                    System.out.println();
                }
            } while (!str.equals("exit"));
            System.out.print("Goodbye");
        }
    }
}
