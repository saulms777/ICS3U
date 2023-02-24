/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 14 2022
 * Description: Exercise 4 - Sum of digits
 */

package randomMath2;

import java.util.Random;

public class Ex4_digitSum {

	public static void main(String[] args) {
		Random Rand = new Random();
		
		int number = 100 + Rand.nextInt(900);
		int sum = number % 10 + number % 100 / 10 + number / 100;
		System.out.printf("Sum of the digits of %d is %d", number, sum);

	}

}
