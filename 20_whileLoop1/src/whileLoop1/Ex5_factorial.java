/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 13 2022
 * Description: Exercise 5 - Factorial
 */


package whileLoop1;

import java.util.Scanner;

public class Ex5_factorial {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("Number: ");
			int num = Input.nextInt();
			int sum = 1;
			int el = num;
			while (el > 0) {
				sum *= el;
				el--;
			}
			System.out.printf("Factorial of %d is %d", num, sum);
		} finally {
			Input.close();
		}

	}

}
