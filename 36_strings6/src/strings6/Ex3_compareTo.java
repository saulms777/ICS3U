/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 15 2022
 * Description: Exercise 3 - compareTo()
 */


package strings6;

import java.util.Scanner;
import java.lang.Math;

public class Ex3_compareTo {

    static int compareTo(String str1, String str2) {
        for (int el = 0; el < Math.min(str1.length(), str2.length()); el++) {
            int dif = str1.charAt(el) - str2.charAt(el);
            if (dif != 0) {
                return dif;
            }
        }
        return 0;
    }

    static int compareToIgnoreCase(String str1, String str2) {
        for (int el = 0; el < Math.min(str1.length(), str2.length()); el++) {
            int dif = Character.toLowerCase(str1.charAt(el)) - Character.toLowerCase(str2.charAt(el));
            if (dif != 0) {
                return dif;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("First word: ");
            String first = sc.next();
            System.out.print("Second word: ");
            String second = sc.next();
            System.out.println(compareTo(first, second));
            System.out.println(compareToIgnoreCase(first, second));
        }
    }
}
