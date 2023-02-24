/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Dec 6 2022
 * Description: Exercise 5 - Magic Squares
 */


package arrays4;

import java.util.Scanner;

public class Ex5_magicSquares {

    private static int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    private static int sum(int[][] array, int column) {
        int sum = 0;
        for (int[] row : array) {
            sum += row[column];
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[][] square = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    square[i][j] = sc.nextInt();
                }
            }

            int sum = sum(square[0]);
            boolean magic = true;
            for (int i = 1; i < 4; i++) {
                if (sum(square[i]) != sum) {
                    magic = false;
                    break;
                }
            }
            for (int i = 0; i < 4; i++) {
                if (sum(square, i) != sum) {
                    magic = false;
                    break;
                }
            }

            if (magic) {
                System.out.print("magic");
            } else {
                System.out.print("not magic");
            }
        }
    }

}
