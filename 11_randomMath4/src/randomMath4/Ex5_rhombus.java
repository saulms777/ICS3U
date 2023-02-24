/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 12 2022
 * Description: Exercise 5 - Rhombus
 */

package randomMath4;

import java.lang.Math;
import java.util.Random;

public class Ex5_rhombus {

	public static void main(String[] args) {
		Random Rand = new Random();
		
		int diag1 = 4 + Rand.nextInt(9);
		int diag2 = 4 + Rand.nextInt(9);
		
		double perimeter = 2 * Math.sqrt(diag1 * diag1 + diag2 * diag2);
		double area = diag1 * diag2 / 2.0;
		
		System.out.printf("Diagonal lengths: %d and %d\nPerimeter: %.2f\nArea: %.2f", diag1, diag2, perimeter, area);

	}

}
