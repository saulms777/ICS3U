/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Dec 15 2022
 * Description: Delete Array Elements
 */


import java.util.Scanner;
import java.util.Arrays;

public class deleteArrayElements {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Size of array: ");
            int size = sc.nextInt();
            System.out.print("a: ");
            int a = sc.nextInt();
            System.out.print("b: ");
            int b = sc.nextInt();

            int[] array = new int[size];
            Arrays.fill(array, 1);

            for (int i = 0; i < size; i++) {
                if (!(i % (a + b) < a)) {
                    array[i] = 0;
                }
            }
            System.out.print(Arrays.toString(array));
        }
    }

}
