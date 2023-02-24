/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Dec 2 2022
 * Description: Exercise 8 - Two arrays
 */


package arrays3;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Ex8_twoArrays {

    private static int[] userInput() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Size of array #1: ");
            int size1 = sc.nextInt();
            System.out.print("Size of array #2: ");
            int size2 = sc.nextInt();
            return new int[]{size1, size2};
        }
    }

    private static int[] large(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = 100 + i;
        }
        return array;
    }

    private static double[] small(int size) {
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = (100.0 + i) / size;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] input = userInput();
        int max = Math.max(input[0], input[1]);
        int min = Math.min(input[0], input[1]);
        int[] large = large(max);
        double[] small = small(min);
        System.out.printf("Larger array: %s\n", String.join(", ", Arrays.toString(large)));
        System.out.printf("Smaller array: %s", String.join(", ", Arrays.toString(small)));
    }

}
