/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 19 2022
 * Description: Exercise 1 - Age
 */


package planning1;

import java.util.Scanner;

public class Ex1_age {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("Age: ");
			int age = Input.nextInt();
			
			System.out.printf("Your age is %s", age);
		} finally {
			Input.close();
		}

	}

}
