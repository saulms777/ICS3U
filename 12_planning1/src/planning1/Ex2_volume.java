/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 19 2022
 * Description: Exercise 2 - Volume
 */


package planning1;

import java.lang.Math;
import java.util.Random;

public class Ex2_volume {

	public static void main(String[] args) {
		Random Rand = new Random();
		
		int radius = Rand.nextInt(100);
		int height = Rand.nextInt(100);
		
		double volume = Math.PI * radius * radius * height / 3.0;
		System.out.printf("Radius: %d\nHeight: %d\nVolume: %f", radius, height, volume);

	}

}
