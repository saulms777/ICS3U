/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 14 2022
 * Description: Sum of Digits
 */


package whileLoop3;

import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			boolean loop = true;
			while (loop) {
				System.out.print("Number: ");
				int num = Input.nextInt();
				if (num > 10000) {
					System.out.println("Enter a number smaller than 10,000");
				} else if (num == 0) {
					loop = false;
				} else {
					int sum = 0;
					int el = 0;
					while (el < (int) Math.log10(num) + 1) {
						sum += num % Math.pow(10, el + 1) / Math.pow(10, el);
						el++;
					}
					System.out.printf("Sum of digits: %d\n", sum);
				}
			}
			System.out.print("Goodbye");
		} finally {
			Input.close();
		}

	}

}
