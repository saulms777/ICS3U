/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Dec 2 2022
 * Description: Exercise 7 - Random Array
 */


package arrays3;

import java.util.Random;
import java.util.Arrays;

public class Ex7_randomArray {

    private static int[] createArray() {
        Random r = new Random();
        int[] array = new int[5 + r.nextInt(6)];
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + r.nextInt(11);
        }
        return array;
    }

    private static boolean have15(int[] array) {
        return array[1] == 15 || array[array.length - 2] == 15;
    }

    public static void main(String[] args) {
        int[] array = createArray();
        System.out.println(String.join(", ", Arrays.toString(array)));
        System.out.println(have15(array));
    }

}
