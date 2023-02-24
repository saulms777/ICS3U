/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sept 22 2022
 * Description: Exercise 2 - Age of dog
 */

package planning4;

import java.util.Random;

public class Ex3_dogAge {

	public static void main(String[] args) {
		Random Rand = new Random();
		
		int dogAge = Rand.nextInt(5);
		if (dogAge * 7 > 15) {
			System.out.print("Dog is older than me");
		} else {
			System.out.print("Dog is younger than me");
		}

	}

}
