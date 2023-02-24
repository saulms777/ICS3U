/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 14 2022
 * Description: Exercise 2 - Substring
 */


package strings5;

import java.util.Scanner;

public class Ex2_substring {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the original string: ");
            String str = sc.nextLine();
            System.out.print("Enter the string you search: ");
            String search = sc.nextLine();
            System.out.printf("%s has %d characters.\n", str, str.length());
            if (str.contains(search)) {
                System.out.printf("%s starts at index %d.", search, str.indexOf(search));
            } else {
                System.out.print("Substring not found");
            }
        }
    }
}
