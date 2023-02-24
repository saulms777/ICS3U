/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 13 2022
 * Description: Exercise 7 - Digit Sum
 */


package whileLoop1;

import java.util.Scanner;
import java.lang.Math;

public class Ex7_digitSum {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("Non-negative number: ");
			int num = Input.nextInt();
			int sum = 0;
			int el = 0;
			while (el < (int) Math.log10(num) + 1) {
				sum += num % Math.pow(10, el + 1) / Math.pow(10, el);
				el++;
			}
			System.out.printf("Sum of digits: %d", sum);
		} finally {
			Input.close();
		}

	}

}
