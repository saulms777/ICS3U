/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 12 2022
 * Description: Exercise 3 - Line
 */


package randomMath4;

import java.util.Random;

public class Ex3_line {

	public static void main(String[] args) {
		Random Rand = new Random();
		
		int x1 = Rand.nextInt();
		int y1 = Rand.nextInt();
		int x2 = Rand.nextInt();
		int y2 = Rand.nextInt();
		
		double m = ((double) y1 - y2) / ((double) x1 - x2);
		double b = y1 - m * x1;
		
		System.out.printf("Line through (%d, %d) and (%d, %d): y = %fx + %f", x1, y1, x2, y2, m, b);

	}

}
