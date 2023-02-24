/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 12 2022
 * Description: Exercise 3 - Bingo Card
 */

package randomMath1;

import java.util.Random;

public class Ex3_bingoCard {

	public static void main(String[] args) {
		Random Rand = new Random();
		
		String[][] bingoCard = new String[5][5];
		for (int row = 0; row < 5; row++) {
			for (int el = 0; el < 5; el++) {
				int num = row * 15 + 1 + Rand.nextInt(15);
				if (num / 10 == 0) {
					bingoCard[row][el] = " " + num;
				} else {
					bingoCard[row][el] = String.valueOf(num);
				}
			}
		}
		bingoCard[2][2] = "FREE";
		
		System.out.println(" B     I     N     G     O");
		for (int row = 0; row < 5; row++) {
			for (int el = 0; el < 5; el++) {
				if ((row == 2) & (el == 1)) {
					System.out.printf("%s  ", bingoCard[row][el]);
				} else {
					System.out.printf("%s    ", bingoCard[row][el]);
				}
			}
			System.out.println();
		}

	}

}
