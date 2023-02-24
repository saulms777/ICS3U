/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 3 2022
 * Description: Exercise 1 - Letters
 */


package ASCII1;

import java.util.Scanner;

public class Ex1_letters {

    public static void main(String[] args) {
        try (Scanner Input = new Scanner(System.in)) {
            int num;
            do {
                System.out.print("Enter a number between 1 and 26: ");
                num = Input.nextInt();
            } while (num < 1 || num > 26);

            char type;
            do {
                System.out.print("Capital or lowercase: (c/l) ");
                type = Input.next().charAt(0);
            } while (type != 'c' && type != 'l');

            int constant;
            if (type == 'c') {
                constant = 64;
            } else {
                constant = 96;
            }

            System.out.printf("Letter: %c", (char) (constant + num));
        }
    }
}
