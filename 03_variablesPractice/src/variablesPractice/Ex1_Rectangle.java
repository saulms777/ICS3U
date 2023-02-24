/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 8 2022
 * Description: Exercise 1 - Rectangle
 */


package variablesPractice;

import java.util.Scanner;

public class Ex1_Rectangle {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("Length of rectangle: ");
			double length = Input.nextDouble();
			System.out.print("Width of rectangle: ");
			double width = Input.nextDouble();
			
			double area = length * width;
			System.out.printf("Area of rectangle: %f", area);
		} finally {
			Input.close();
		}

	}

}
