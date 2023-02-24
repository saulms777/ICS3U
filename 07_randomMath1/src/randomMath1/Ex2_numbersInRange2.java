/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 12 2022
 * Description: Exercise 2 - Numbers in a range 2
 */

package randomMath1;

import java.util.Scanner;
import java.util.Random;

public class Ex2_numbersInRange2 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		Random Rand = new Random();
		
		try {
			System.out.print("Enter first number: ");
			int min = Input.nextInt();
			System.out.print("Enter second number: ");
			int max = Input.nextInt();
			
			System.out.print(min + Rand.nextInt(max - min + 1));
		} finally {
			Input.close();
		}

	}

}
