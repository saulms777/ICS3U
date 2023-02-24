/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 22 2022
 * Description: Exercise 2 - Box
 */


package methods2;

import java.util.Scanner;

public class Ex2_box {

    /**
     * Prints a line using the character *
     *
     * @param width Width of printed line
     */
    private static void drawBar(int width) {
        for (int el = 0; el < width; el++) {
            System.out.print("*");
        }
        System.out.println();
    }

    /**
     * Prints a hallow box with the character *
     *
     * @param height Height of printed box
     * @param width Width of printed box
     */
    private static void drawBox(int height, int width) {
        drawBar(width);
        for (int i = 0; i < height - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < width - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        drawBar(width);
    }

    /**
     * Main method to get height and width from user input
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Height: ");
            int height = sc.nextInt();
            System.out.print("Width: ");
            int width = sc.nextInt();
            drawBox(height, width);
        }
    }

}
