/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 12 2022
 * Description: Exercise 1 - Sum
 */


package randomMath4;

import java.util.Random;

public class Ex1_sum {

	public static void main(String[] args) {
		Random Rand = new Random();
		
		int num1 = 1 + Rand.nextInt(10);
		int num2 = 10 + Rand.nextInt(11);
		
		int sum = num2 * (num2 + 1) / 2 - num1 * (num1 - 1) / 2;
		System.out.printf("Sum of numbers from %d to %d: %d", num1, num2, sum);

	}

}
