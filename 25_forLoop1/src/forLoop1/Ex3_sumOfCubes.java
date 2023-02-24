/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 20 2022
 * Description: Exercise 3 - Sum of Cubes
 */


package forLoop1;

import java.util.Scanner;
import java.lang.Math;

public class Ex3_sumOfCubes {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("Enter a number: ");
			int num = Input.nextInt();
			int sum = 0;
			int digit;
			System.out.println("The sum of the cubes of the digits is:");
			for (int el = (int) Math.log10(num) + 1; el > 0; el--) {
				digit = num % (int) Math.pow(10, el) / (int) Math.pow(10, el - 1);
				sum += Math.pow(digit, 3);
				System.out.printf("%d^3", digit);
				if (el - 1 > 0) {
					System.out.print(" + ");
				}
			}
			System.out.printf(" = %d", sum);
		} finally {
			Input.close();
		}

	}

}
