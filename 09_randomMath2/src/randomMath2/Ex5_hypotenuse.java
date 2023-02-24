/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 12 2022
 * Description: Exercise 5 - Hypotenuse
 */

package randomMath2;

import java.lang.Math;
import java.util.Random;

public class Ex5_hypotenuse {

	public static void main(String[] args) {
		Random Rand = new Random();
		
		int a = Rand.nextInt(11);
		int b = Rand.nextInt(11);
		double c = Math.sqrt(a * a + b * b);
		
		System.out.printf("The hypotenuse of sides %d and %d is %f", a, b, c);

	}

}
