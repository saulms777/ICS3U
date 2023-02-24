/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 15 2022
 * Description: Exercise 1 - Name and Year
 */


package strings6;

import java.util.Scanner;

public class Ex1_nameYear {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String first;
            do {
                System.out.print("Enter first name: ");
                first = sc.nextLine();
                if (!first.equals("QUIT")) {
                    System.out.print("Enter last name: ");
                    String last = sc.nextLine();
                    System.out.print("Enter year of birth: ");
                    String year = sc.nextLine();

                    for (int el = 0; el < first.length(); el++) {
                        if (el % 2 == 0) {
                            System.out.print(first.substring(el, el + 1).toUpperCase());
                        } else {
                            System.out.print(first.charAt(el));
                        }
                    }
                    System.out.print(year.substring(0, year.length() / 2));
                    System.out.print(last);
                    System.out.print(year.substring(year.length() / 2));
                    System.out.println();
                }
            } while (!first.equals("QUIT"));
            System.out.print("Goodbye");
        }
    }
}
