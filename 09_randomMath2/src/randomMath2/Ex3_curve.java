/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 14 2022
 * Description: Exercise 3 - Curve
 */

package randomMath2;

import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Ex3_curve {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		Random Rand = new Random();
		
		try {
			System.out.print("Y-coordinate: ");
			double y1 = Input.nextDouble();
			double x1 = Math.cbrt(- y1 - 7) - 4;
			System.out.printf("(%f, %f)\n", x1, y1);
			
			double x2 = Rand.nextInt(21) - 10;
			double y2 = - Math.pow(x2 + 4, 3) - 7;
			double x3 = Rand.nextInt(21) - 10;
			double y3 = - Math.pow(x3 + 4, 3) - 7;
			System.out.printf("(%f, %f), (%f, %f)", x2, y2, x3, y3);
		} finally {
			Input.close();
		}

	}

}
