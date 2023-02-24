/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 8 2022
 * Description: Exercise 4 - Interest
 */


package variablesPractice;

import java.util.Scanner;

public class Ex4_Interest {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			final int principal = 17000;
			final int interestRate = 7;
			System.out.printf("Principal balance: %d\n", principal);
			System.out.printf("Interest rate: %d\n", interestRate);
			
			System.out.print("Years elapsed: ");
			int years = Input.nextInt();
			
			double interest = principal * Math.pow(1 + interestRate / 100.0, years) - principal;
			System.out.printf("Interest earned: %f\n", interest);
			System.out.printf("Final balance: %f", (double) principal + interest);
		} finally {
			Input.close();
		}
		
	}

}
