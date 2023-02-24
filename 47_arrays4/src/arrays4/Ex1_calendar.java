/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Dec 5 2022
 * Description: Exercise 1 - Calendar
 */


package arrays4;

import java.util.HashMap;
import java.util.Scanner;

public class Ex1_calendar {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter month: ");
            String month = sc.next();
            System.out.print("Enter day: ");
            String day = sc.next();

            HashMap<String, Integer> monthNum = new HashMap<>(){{
                put("Jan", 0);
                put("Feb", 1);
                put("Mar", 2);
                put("Apr", 3);
                put("May", 4);
                put("Jun", 5);
                put("Jul", 6);
                put("Aug", 7);
                put("Sep", 8);
                put("Oct", 9);
                put("Nov", 10);
                put("Dec", 11);
            }};
            int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            HashMap<String, Integer> dayNum = new HashMap<>(){{
                put("Mon", 0);
                put("Tues", 1);
                put("Wed", 2);
                put("Thur", 3);
                put("Fri", 4);
                put("Sat", 5);
                put("Sun", 6);
            }};

            System.out.println("Mon    Tues   Wed    Thur   Fri    Sat    Sun");
            for (int i = 0; i < dayNum.get(day); i++) {
                System.out.print("       ");
            }
            for (int i = 0; i < monthDays[monthNum.get(month)]; i++) {
                if ((dayNum.get(day) + i) % 7 == 0) {
                    System.out.println();
                }
                System.out.print(i + 1);
                if (i < 9) {
                    System.out.print(" ");
                }
                System.out.print("     ");
            }
        }
    }

}
