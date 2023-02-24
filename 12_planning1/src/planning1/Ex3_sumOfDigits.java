/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 19 2022
 * Description: Exercise 3 - Sum of digits
 */


package planning1;

import java.util.Scanner;

public class Ex3_sumOfDigits {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("5 digit number: ");
			int num = Input.nextInt();
			
			int ones = num % 10;
			int tens = num % 100 / 10;
			int hundreds = num % 1000 / 100;
			int thousands = num % 10000 / 1000;
			int tenThousands = num / 10000;
			int sum = ones + tens + hundreds + thousands + tenThousands;
			
			System.out.printf("Sum of digits: %d", sum);
		} finally {
			Input.close();
		}

	}

}
