/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 12 2022
 * Description: Exercise 3 - Object Height
 */


package numberFormatting1;

import java.util.Scanner;
import java.text.NumberFormat;

public class Ex3_objectHeight {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		NumberFormat Decimal = NumberFormat.getNumberInstance();
		
		try {
			System.out.print("Enter a starting height: ");
			double startingHeight = Input.nextDouble();
			System.out.print("Enter a time in seconds: ");
			double time = Input.nextDouble();
			
			double finalHeight = startingHeight - 4.9 * time * time;
			System.out.printf("The height of the object is %s metres", Decimal.format(finalHeight));
		} finally {
			Input.close();
		}

	}

}
