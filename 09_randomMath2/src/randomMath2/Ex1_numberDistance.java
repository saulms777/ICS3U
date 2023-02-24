/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 14 2022
 * Description: Exercise 1 - Distance between numbers
 */

package randomMath2;

import java.util.Scanner;
import java.util.Random;

public class Ex1_numberDistance {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		Random Rand = new Random();
		
		try {
			System.out.print("Number: ");
			int num1 = Input.nextInt();
			int num2 = num1 + Rand.nextInt(11);
			int distance = num2 - num1;
			System.out.printf("Random number: %d\nDistance: %d", num2, distance);
		} finally {
			Input.close();
		}

	}

}
