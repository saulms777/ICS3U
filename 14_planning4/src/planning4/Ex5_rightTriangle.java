/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sept 22 2022
 * Description: Exercise 5 - Right triangle
 */

package planning4;

import java.util.Scanner;
import java.lang.Math;

public class Ex5_rightTriangle {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("a: ");
			int a = Input.nextInt();
			System.out.print("b: ");
			int b = Input.nextInt();
			System.out.print("c: ");
			int c = Input.nextInt();
			
			int max = Math.max(Math.max(a, b), c);
			if (a * a + b * b + c * c == 2 * max * max) {
				System.out.print("Sides of a right triangle");
			} else {
				System.out.print("Not sides of a right triangle");
			}
		} finally {
			Input.close();
		}

	}

}
