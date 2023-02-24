/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sept 27 2022
 * Description: Exercise 2 - Dice
 */


package ifStructure3;

import java.util.Random;
import java.lang.Math;

public class Ex2_dice {

	public static void main(String[] args) {
		Random Rand = new Random();
		
		int dice1 = 1 + Rand.nextInt(6);
		int dice2 = 1 + Rand.nextInt(6);
		System.out.printf("%d\n%d\n", dice1, dice2);
		
		if (dice1 == 5 || dice2 == 5 || dice1 + dice2 == 5 || Math.abs(dice1 - dice2) == 5) {
			System.out.println("5 is awesome");
			if ((dice1 == 5 || dice2 == 5) && dice1 + dice2 == 10) {
				System.out.println("10 is amazing too");
			}
		}

	}

}
