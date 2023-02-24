/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 4 2022
 * Description: Exercise 2 - Encryption
 */


package ASCII2;

import java.util.Scanner;

public class Ex2_encryption {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter a character: ");
                String input = sc.next();
                if (input.equals("exit")) {
                    break;
                }
                char letter = input.charAt(0);
                System.out.print("Spaces to move: ");
                int spaces = sc.nextInt();
                int constant;
                if (Character.isUpperCase((letter))) {constant = 65;} else {constant = 97;}
                System.out.printf("Encrypted character: %c\n", constant + ((int) letter - constant + spaces) % 26);
            }
        }
    }
}
