/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 4 2022
 * Description: Exercise 1 - Print Characters
 */


package ASCII2;

import java.util.Scanner;
import java.util.Random;

public class Ex1_printChars {

    public static void main(String[] args) {
        Random Rand = new Random();
        try (Scanner Input = new Scanner(System.in)) {
            System.out.print("Number of letters to print: ");
            int num = Input.nextInt();

            int[] ascii = {65, 66, 97, 98};
            int type = Rand.nextInt(4);
            for (int el = 0; el < num; el++) {
                System.out.printf("%c ", (char) (ascii[type] + 2 * el));
            }
        }
    }
}
