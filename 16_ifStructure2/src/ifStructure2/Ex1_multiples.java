/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sept 26 2022
 * Description: Exercise 1 - Multiples
 */


package ifStructure2;

import java.util.Scanner;
import java.lang.Math;

public class Ex1_multiples {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("First number: ");
			int num1 = Input.nextInt();
			System.out.print("Second number: ");
			int num2 = Input.nextInt();
			
			int temp = Math.max(num1, num2);
			if (temp == num2) {
				num2 = num1;
				num1 = temp;
			}
			
			System.out.printf("\nHigher number: %d", num1);
			System.out.printf("\nLower number: %d", num2);
			if (num1 % num2 == 0) {
				System.out.print("\nOne number is a multiple of the other number");
			} else {
				System.out.print("\nOne number is not a multiple of the other number");
			}
		} finally {
			Input.close();
		}

	}

}
