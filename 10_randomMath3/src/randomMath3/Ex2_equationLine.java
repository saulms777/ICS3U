/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 12 2022
 * Description: Exercise 2 - Equation of a line
 */

package randomMath3;

import java.util.Random;

public class Ex2_equationLine {

	public static void main(String[] args) {
		Random Rand = new Random();
		
		double x1 =  Rand.nextInt(161) / 10.0 - 8.0;
		double y1 =  Rand.nextInt(161) / 10.0 - 8.0;
		double x2 =  Rand.nextInt(161) / 10.0 - 8.0;
		double y2 =  Rand.nextInt(161) / 10.0 - 8.0;
		
		double m = (y1 - y2) / (x1 - x2);
		double b = y1 - m * x1;
		
		System.out.printf("Points: (%.1f, %.1f) and (%.1f, %.1f)\n", x1, y1, x2, y2);
		System.out.printf("Equation of line: f(x) = %fx + %f", m, b);

	}

}
