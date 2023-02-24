/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 10 2022
 * Description: Exercise 3 - Shift
 */


package strings3;

import java.util.Scanner;

public class Ex3_shift {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter string: ");
            String str = sc.nextLine();

            if (str.length() < 4) {
                System.out.print("String length is too short.");
            } else {
                String str1 = str.substring(0, 2);
                String str2 = str.substring(2, 4);
                str = str.substring(4);
                System.out.printf("%s%s%s", str2, str1, str);
            }
        }
    }
}
