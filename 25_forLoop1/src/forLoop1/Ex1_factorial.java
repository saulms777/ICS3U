/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 20 2022
 * Description: Exercise 1 - Factorial
 */


package forLoop1;

import java.util.Scanner;

public class Ex1_factorial {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			int num;
			do {
				do {
					System.out.print("Number: ");
					num = Input.nextInt();
				} while ((num >= 8 || num < 0) && num != 0);
				
				if (num != 0) {
					int fac = 1;
					for (int el = num; el > 0; el--) {
						fac *= el;
					}
					System.out.printf("%d! = %d\n", num, fac);
				}
			} while (num != 0);			
		} finally {
			Input.close();
		}

	}

}
