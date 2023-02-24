/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 14 2022
 * Description: Exercise 2 - Don't count 13
 */


package whileLoop2;

import java.util.Scanner;

public class Ex2_no13 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			int sum = 0;
			int num;
			boolean isThirteen = false;
			boolean loop = true;
			while (loop) {
				System.out.print("Number: ");
				num = Input.nextInt();
				if (num == 0) {
					loop = false;
				} else if (num == 13) {
					isThirteen = true;
				} else if (isThirteen) {
					isThirteen = false;
				} else if (num > 50) {
					System.out.println("Please enter a smaller number");
				} else {
					sum += num;
				}
			}
			System.out.printf("Sum: %d", sum);
		} finally {
			Input.close();
		}

	}

}
