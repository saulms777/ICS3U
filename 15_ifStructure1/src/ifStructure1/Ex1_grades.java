/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sept 22 2022
 * Description: Exercise 1 - Grades
 */


package ifStructure1;

import java.util.Scanner;

public class Ex1_grades {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("Mark: ");
			int mark = Input.nextInt();
			
			if (mark < 0 || mark > 100) {
				System.out.print("Impossible");
			} else if (mark > 90) {
				System.out.print("Excellent job");
			} else if (mark > 80) {
				System.out.print("Work hard");
			} else if (mark > 50) {
				System.out.print("Pass");
			} else {
				System.out.print("Fail");
			}
		} finally {
			Input.close();
		}

	}

}
