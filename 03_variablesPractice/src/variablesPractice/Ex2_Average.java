/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 8 2022
 * Description: Exercise 2 - Average
 */


package variablesPractice;

import java.util.Scanner;

public class Ex2_Average {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			String[] inputNumbers = {"First", "Second", "Third", "Fourth", "Fifth"};
			double total = 0.0;
			for (int el = 0; el < 4; el++) {
				System.out.printf("%s number: ", inputNumbers[el]);
				total += Input.nextDouble();
			}
			
			double average = total / 4;
			System.out.printf("Average of numbers: %f", average);
		} finally {
			Input.close();
		}

	}

}
