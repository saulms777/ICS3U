/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 29 2022
 * Description: Exercise 2 - Indexes
 */


package arrays1;

import java.lang.Math;

public class Ex2_indexes {

    public static void main(String[] args) {
        int[] squares = new int[10];
        for (int i = 0; i < 10; i++) {
            squares[i] = i*i;
        }
        System.out.print("Squares: ");
        for (int square : squares) {
            System.out.printf("%d ", square);
        }
        System.out.println();

        int[] power = new int[10];
        for (int i = 0; i < 10; i++) {
            power[i] = (int) Math.pow(2, i);
        }
        System.out.print("Powers of 2: ");
        for (int square : power) {
            System.out.printf("%d ", square);
        }

    }

}
