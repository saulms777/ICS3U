/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 29 2022
 * Description: Exercise 3 - Weekdays
 */


package arrayInvestigation;

import java.util.Scanner;

public class Ex3_weekdays {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] days = new String[7];
            for (int i = 0; i < days.length; i++) {
                System.out.print("Day: ");
                days[i] = sc.nextLine();
            }
            for (String day : days) {
                System.out.printf("%s ", day);
            }
        }
    }

}
