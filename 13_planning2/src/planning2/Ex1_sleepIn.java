/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sept 22 2022
 * Description: Exercise 1 - Sleep in
 */

package planning2;

import java.util.Scanner;

public class Ex1_sleepIn {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("Are you on vacation? (0/1) ");
			int vacation = Input.nextInt();
			System.out.print("Is it a weekday? (0/1) ");
			int weekday = Input.nextInt();
			
			if (vacation == 1 || weekday == 1) {
				System.out.print("It's okay to sleep in");
			}
		} finally {
			Input.close();
		}

	}

}
