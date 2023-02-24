/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 14 2022
 * Description: Exercise 5 - Palindrome
 */


package strings5;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Ex5_palindrome {

    static boolean isPalindrome(@NotNull String str) {
        for (int el = 0; el <= str.length() / 2; el++) {
            if (str.charAt(el) != str.charAt(str.length() - 1 - el)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean palindrome = false;
            while (!palindrome) {
                System.out.print("Enter a string: ");
                if (isPalindrome(sc.nextLine())) {
                    palindrome = true;
                }
            }
            System.out.print("This is a palindrome");
        }
    }
}
