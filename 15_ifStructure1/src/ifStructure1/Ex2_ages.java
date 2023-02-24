/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sept 22 2022
 * Description: Exercise 2 - Ages
 */


package ifStructure1;

import java.util.Scanner;

public class Ex2_ages {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("Age: ");
			int age = Input.nextInt();
			
			if (age > 18) {
				System.out.print("Adult");
			} else if (age <= 5) {
				System.out.print("Toddler");
			} else if (age <= 10) {
				System.out.print("Child");
			} else if (age <= 12) {
				System.out.print("Preteen");
			} else {
				System.out.print("Teen");
			}
		} finally {
			Input.close();
		}


	}

}
