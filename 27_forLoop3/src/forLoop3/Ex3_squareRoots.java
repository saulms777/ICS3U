/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 31 2022
 * Description: Exercise 3 - Square roots
 */


package forLoop3;

import java.lang.Math;

public class Ex3_squareRoots {

    public static void main(String[] args) {
        // This program prints all the numbers between 1 and 9 along with their respective square roots
        for (int count = 1; count < 10; count++) {
            System.out.printf("%d %f\n", count, Math.sqrt(count));
        }
    }
}
