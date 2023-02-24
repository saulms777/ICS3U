/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 8 2022
 * Description: Exercise 5 - Digits
 */


package variablesPractice;

import java.util.Scanner;

public class Ex5_Digits {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("Number: ");
			int number = Input.nextInt();
			
			String[] digitNames = {"ones", "tens", "hundreds", "thousands"};
			int[] digitPlaces = {number % 10, number % 100 / 10, number % 1000 / 100, number % 10000 / 1000};
			for (int el = 0; el < 4; el++) {
				System.out.printf("Digit in %s place: %d\n", digitNames[el], digitPlaces[el]);
			}
		} finally {
			Input.close();
		}

	}

}
