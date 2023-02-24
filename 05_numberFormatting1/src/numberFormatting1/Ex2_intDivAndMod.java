/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 12 2022
 * Description: Exercise 2 - Integer Division and Modulus
 */

package numberFormatting1;

import java.util.Scanner;

public class Ex2_intDivAndMod {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("Enter first integer: ");
			int firstNum = Input.nextInt();
			System.out.print("Enter second integer: ");
			int secondNum = Input.nextInt();
			
			System.out.printf("\n%d / %d = %d", firstNum, secondNum, firstNum / secondNum);
			System.out.printf("\n%d %s %d = %d", firstNum, "%", secondNum, firstNum % secondNum);
			System.out.printf("\n%d / %d = %d", secondNum, firstNum, secondNum / firstNum);
			System.out.printf("\n%d %s %d = %d", secondNum, "%", firstNum, secondNum % firstNum);
		} finally {
			Input.close();
		}

	}

}
