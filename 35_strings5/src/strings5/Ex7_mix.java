/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 14 2022
 * Description: Exercise 7 - Mix
 */


package strings5;

import java.util.Scanner;

public class Ex7_mix {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str1, str2;
            do {
                System.out.print("Enter string 1: ");
                str1 = sc.nextLine();
                System.out.print("Enter string 2: ");
                str2 = sc.nextLine();
                if (str1.length() != str2.length()) {
                    System.out.println("Not the same length");
                }
            } while (str1.length() != str2.length());
            System.out.print("Mixed string: ");
            for (int el = 0; el < str1.length(); el++) {
                System.out.printf("%c%c", str1.charAt(el), str2.charAt(el));
            }
        }
    }
}
