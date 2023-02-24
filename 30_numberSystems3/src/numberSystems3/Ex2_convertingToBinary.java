/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 2 2022
 * Description: Exercise 2 - Converting to Binary
 */


package numberSystems3;

import java.util.Scanner;

public class Ex2_convertingToBinary {

    public static void main(String[] args) {
        try (Scanner Input = new Scanner(System.in)) {
            System.out.print("Enter a decimal number: ");
            int num = Input.nextInt();
            System.out.printf("The binary number is: %s", Integer.toBinaryString(num));
        }
    }
}
