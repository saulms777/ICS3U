/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 29 2022
 * Description: Exercise 2 - Display
 */


package arrayInvestigation;

import java.util.Arrays;

public class Ex2_display {

    public static void main(String[] args) {
        int[] num = {5, 8, 13, 41, 1};

        System.out.println(Arrays.toString(num));
        System.out.println();

        int i = 0;
        while (i < num.length) {
            System.out.println(num[i]);
            i++;
        }
        System.out.println();

        for (int j : num) {
            System.out.println(j);
        }
    }

}
