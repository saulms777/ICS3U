/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 13 2022
 * Description: Exercise 3 - Number Sum
 */


package whileLoop1;

import java.util.Scanner;

public class Ex3_numberSum {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("Number: ");
			int num = Input.nextInt();
			int el = 1;
			while (el < num + 1) {
				System.out.println(el);
				el++;
			}
			System.out.printf("Sum: %d", num * (num + 1) / 2);
		} finally {
			Input.close();
		}

	}

}
