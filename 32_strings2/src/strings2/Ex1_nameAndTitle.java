/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 9 2022
 * Description: Exercise 1 - Name and Title
 */


package strings2;

import java.util.Scanner;

public class Ex1_nameAndTitle {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter name: ");
                String input = sc.nextLine().trim();
                if (input.equals("exit")) {
                    break;
                }
                int space = input.indexOf(" ");
                if (space == -1) {
                    System.out.printf("Hello %s\n", input);
                } else {
                    if (input.substring(0, space).equals("Mr.")) {
                        System.out.println("Hello sir");
                    } else {
                        System.out.println("Hello ma'am");
                    }
                }
            }
            System.out.print("Goodbye");
        }
    }
}
