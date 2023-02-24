/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sept 22 2022
 * Description: Exercise 3 - Roots
 */


package ifStructure1;

import java.util.Scanner;
import java.lang.Math;

public class Ex3_roots {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("a: ");
			int a = Input.nextInt();
			System.out.print("b: ");
			int b = Input.nextInt();
			System.out.print("c: ");
			int c = Input.nextInt();
			
			int discriminant = b * b - 4 * a * c;
			if (discriminant > 0) {
				System.out.println("There are two roots");
				double root1 = (-b + Math.sqrt(discriminant)) / 2.0;
				double root2 = (-b - Math.sqrt(discriminant)) / 2.0;
				System.out.printf("Roots: %.2f, %.2f", root1, root2);
			} else if (discriminant == 0) {
				System.out.println("There is one root");
				System.out.printf("Root: %d", -b / 2);
			} else {
				System.out.println("There are no roots");
			}
		} finally {
			Input.close();
		}

	}

}
