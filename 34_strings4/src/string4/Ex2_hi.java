/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 11 2022
 * Description: Exercise 2 - Hi
 */


package string4;

import java.util.Scanner;

public class Ex2_hi {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str;
            do {
                System.out.print("Enter string: ");
                str = sc.nextLine();

                if (!str.equals("Exit")) {
                    int count = 0;
                    int index = str.indexOf("hi");
                    while (index != -1) {
                        count++;
                        str = str.substring(index + 2);
                        index = str.indexOf("hi");
                    }
                    System.out.println(count);
                }
            } while (!str.equals("Exit"));
            System.out.print("Goodbye");
        }
    }
}
