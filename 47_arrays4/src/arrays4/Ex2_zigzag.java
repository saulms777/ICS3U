/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Dec 5 2022
 * Description: Exercise 2 - Zig Zag
 */


package arrays4;

import java.util.Arrays;
import java.util.Scanner;

public class Ex2_zigzag {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Word: ");
            String word = sc.next();
            System.out.print("Number of rows: ");
            int row = sc.nextInt();

            if (word.length() % (2 * row - 2) != 0) {
                word += " ".repeat(2 * row - 2 - word.length() % (2 * row - 2));
            }

            String[] rows = new String[row];
            Arrays.fill(rows, "");
            int r;
            boolean vertical;
            for (int period = 0; period < word.length(); period += 2 * row - 2) {
                vertical = false;
                for (int character = 0; character < 2 * row - 2; character++) {
                    char letter = word.charAt(period + character);
                    if (character < row / 2) {
                        r = row / 2 - character;
                    } else if (character < row + row / 2) {
                        r = character - row / 2;
                        vertical = true;
                    } else {
                        // row - (character - row - (row / 2 - 1) + 1)
                        r = 2 * row + row / 2 - character - 2;
                        vertical = false;
                    }
                    for (int i = 0; i < rows.length; i++) {
                        if (i == r) {
                            rows[i] += letter;
                        } else if (!vertical) {
                            rows[i] += " ";
                        }
                    }
                }
            }

            for (String str : rows) {
                System.out.println(str);
            }
            System.out.print(String.join("", rows).replaceAll(" ", ""));
        }
    }

}
