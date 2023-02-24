/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 8 2022
 * Description: Exercise 2 - Cm to In
 */


package userInput;

import java.util.Scanner;

public class Ex3_cmToIn {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("Centimetres: ");
			double cm = Input.nextDouble();
			
			double totalIn = cm / 2.54;
			int ft = (int) totalIn / 12;
			double in = totalIn - 12 * ft;
			
			System.out.printf("%f cm = %d ft %f in", cm, ft, in);
		} finally {
			Input.close();
		}

	}

}
