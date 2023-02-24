/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 12 2022
 * Description: Exercise 2 - Equation
 */

package randomMath4;

import java.util.Random;

public class Ex2_equation {

	public static void main(String[] args) {
		Random Rand = new Random();
		
		int a = 1 + Rand.nextInt(16);
		int b = 2 + Rand.nextInt(19);
		
		double x = - (double) b / (double) a;
		System.out.printf("%dx + %d = 0 --> x = %f", a, b, x);

	}

}
