/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 13 2022
 * Description: Exercise 6 - Prime
 */


package whileLoop1;

import java.util.Scanner;

public class Ex6_prime {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("Number: ");
			int num = Input.nextInt();
			int el = 2;
			boolean loop = true;
			while (loop) {
				if (num % el == 0) {
					loop = false;
				}
				el++;
			}
			if (el == num + 1) {
				System.out.printf("%d is a prime number", num);
			} else {
				System.out.printf("%d is not a prime number", num);
			}
		} finally {
			Input.close();
		}

	}

}
