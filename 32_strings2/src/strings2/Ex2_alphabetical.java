/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 9 2022
 * Description: Exercise 2 - Alphabetical
 */


package strings2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex2_alphabetical {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter words: ");
            List<String> phrases = new ArrayList<>(Arrays.asList(sc.nextLine().split(", ")));
            phrases.sort(String.CASE_INSENSITIVE_ORDER);
            System.out.printf("In alphabetical order: %s", String.join(", ", phrases));
        }
    }
}
