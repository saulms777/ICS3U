/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 14 2022
 * Description: Exercise 6 - Words
 */


package strings5;

import java.util.Scanner;

public class Ex6_words {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String str = sc.nextLine().trim();
            int count = 0;
            for (int el = 0; el < str.length(); el++) {
                if (str.charAt(el) == ' ') {
                    count++;
                }
            }
            System.out.printf("This sentence has %d words", count + 1);
        }
    }
}
