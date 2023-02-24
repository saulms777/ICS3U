/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 20 2022
 * Description: Exercise 2 - Odd Numbers
 */


package forLoop1;

import java.util.Scanner;

public class Ex2_oddNumbers {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			int num;
			do {
				System.out.print("Number: ");
				num = Input.nextInt();
			} while (num > 40 || num < 3);
			
			int sum = 1;
			System.out.print(1);
			for (int el = 3; el < num + 1; el += 2) {
				sum += el;
				System.out.printf(" + %d", el);
			}
			System.out.printf(" = %d", sum);
		} finally {
			Input.close();
		}

	}

}
