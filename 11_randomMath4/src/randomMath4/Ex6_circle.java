/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 12 2022
 * Description: Exercise 6 - Circle
 */


package randomMath4;

import java.lang.Math;
import java.util.Random;

public class Ex6_circle {

	public static void main(String[] args) {
		Random Rand = new Random();
		
		int area = Math.abs(Rand.nextInt());
		double radius = Math.sqrt(area) / Math.PI;
		double circum = 2 * radius * Math.PI;
		
		System.out.printf("Area: %d\nRadius: %.2f\nCircumference: %.2f", area, radius, circum);

	}

}
