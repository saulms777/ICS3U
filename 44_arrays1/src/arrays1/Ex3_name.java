/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 29 2022
 * Description: Exercise 3 - Name
 */


package arrays1;

import java.util.Scanner;

public class Ex3_name {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            name = name.substring(0, 1).toUpperCase() + name.substring(1);
            System.out.print("Name: ");
            for (int i = name.length() - 1; i >= 0; i--) {
                System.out.print(name.charAt(i));
            }
        }
    }

}
