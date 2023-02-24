/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 12 2022
 * Description: Exercise 5 - Volume
 */

package randomMath1;

import java.lang.Math;
import java.util.Random;

public class Ex5_volume {

	public static void main(String[] args) {
		Random Rand = new Random();
		
		int length = 1 + Rand.nextInt(100);
		int width = 1 + Rand.nextInt(100);
		int height = 1 + Rand.nextInt(100);
		System.out.printf("%dx%dx%d = %d", length, width, height, length * width * height);
		
		int radius = 1 + Rand.nextInt(15);
		System.out.printf("\npi*%d^2 = %f", radius, Math.PI * radius * radius);
		
		int side = 15 + Rand.nextInt(21);
		System.out.printf("\n%d^3 = %d", side, side * side * side);

	}

}
