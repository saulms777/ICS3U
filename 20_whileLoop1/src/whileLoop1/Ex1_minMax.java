/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 13 2022
 * Description: Exercise 1 - Min and Max
 */


package whileLoop1;

import java.util.Scanner;

public class Ex1_minMax {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("Minimum number: ");
			int min = Input.nextInt();
			System.out.print("Maximum number: ");
			int max = Input.nextInt();
			int num = min - 1;
			while (num > max || num < min) {
				System.out.print("Number: ");
				num = Input.nextInt();
			}
		} finally {
			Input.close();
		}

	}

}
