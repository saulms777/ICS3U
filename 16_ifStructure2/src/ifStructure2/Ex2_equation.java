/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sept 26 2022
 * Description: Exercise 2 - Equation
 */


package ifStructure2;

import java.util.Scanner;

public class Ex2_equation {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("a: ");
			int a = Input.nextInt();
			System.out.print("b: ");
			int b = Input.nextInt();
			
			if (a == 0) {
				System.out.print("x is undefined");
			} else {
				System.out.printf("x is %.2f", (double) b / (double) a);
			}
		} finally {
			Input.close();
		}

	}

}
