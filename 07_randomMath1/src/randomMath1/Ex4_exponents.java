/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 12 2022
 * Description: Exercise 4 - Exponents
 */

package randomMath1;

import java.lang.Math;
import java.util.Random;

public class Ex4_exponents {

	public static void main(String[] args) {
		Random Rand = new Random();
		
		int base = 1 + Rand.nextInt(9);
		int exponent = Rand.nextInt(6);
		
		System.out.printf("%d^%d = %d", base, exponent, (int) Math.pow(base, exponent));

	}

}
