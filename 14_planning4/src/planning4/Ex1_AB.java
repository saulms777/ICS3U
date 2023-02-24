/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sept 22 2022
 * Description: Exercise 1 - A and B
 */

package planning4;

import java.util.Scanner;

public class Ex1_AB {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("A: ");
			int a = Input.nextInt();
			System.out.print("B: ");
			int b = Input.nextInt();
			
			if (a > b) {
				System.out.printf("Sum: %d", a + b);
			} else {
				System.out.printf("Product: %d", a * b);
			}
		} finally {
			Input.close();
		}

	}

}
