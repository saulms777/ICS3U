/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 21 2022
 * Description: Exercise 3 - Time Converter
 */


package methods1;

import java.util.Scanner;

public class Ex3_timeConverter {

    private static int userInput() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print(
                """
                Conversions:
                1 - Hours to Days
                2 - Days to Hours
                3 - Hours to Minutes
                4 - Minutes to Hours
                """);
            System.out.print("Conversion: ");
            return sc.nextInt();
        }
    }

    private static double hToD(int hours) {
        return hours / 24.0;
    }

    private static double dToH(int days) {
        return days * 24.0;
    }

    private static double hToM(int hours) {
        return hours * 60.0;
    }

    private static double mToH(int min) {
        return min / 60.0;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Number of time units: ");
            int time = sc.nextInt();
            double converted = switch (userInput()) {
                case 1 -> hToD(time);
                case 2 -> dToH(time);
                case 3 -> hToM(time);
                case 4 -> mToH(time);
                default -> throw new IllegalStateException("Unexpected value: " + userInput());
            };
            System.out.printf("Number of converted time units: %.2f", converted);
        }
    }

}
