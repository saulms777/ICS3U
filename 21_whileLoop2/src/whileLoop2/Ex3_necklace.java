/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 14 2022
 * Description: Exercise 3 - Necklace
 */


package whileLoop2;

import java.util.Scanner;

public class Ex3_necklace {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("First number: ");
			int first1 = Input.nextInt();
			System.out.print("Second number: ");
			int first2 = Input.nextInt();
			System.out.printf("The necklace is:\n%d   %d", first1, first2);
			
			int num1 = first1;
			int num2 = first2;
			boolean loop = true;
			while (loop) {
				int temp = num2;
				num2 = (num1 + num2) % 10;
				num1 = temp;
				System.out.printf("   %d", num2);
				if (num1 == first1 && num2 == first2) {
					loop = false;
				}
			}
		} finally {
			Input.close();
		}

	}

}
