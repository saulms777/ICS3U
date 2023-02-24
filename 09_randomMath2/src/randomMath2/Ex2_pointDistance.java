/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 14 2022
 * Description: Exercise 2 - Distance between points
 */

package randomMath2;

import java.lang.Math;
import java.util.Random;

public class Ex2_pointDistance {

	public static void main(String[] args) {
		Random Rand = new Random();
		
		int x1 = Rand.nextInt(21) - 10;
		int y1 = Rand.nextInt(21) - 10;
		int x2 = Rand.nextInt(21) - 10;
		int y2 = Rand.nextInt(21) - 10;
		double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		
		System.out.printf("Distance between (%d, %d) and (%d, %d) is %f", x1, y1, x2, y2, distance);

	}

}
