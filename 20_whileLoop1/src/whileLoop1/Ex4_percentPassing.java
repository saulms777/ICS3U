/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 13 2022
 * Description: Exercise 4 - Percent Passing
 */


package whileLoop1;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex4_percentPassing {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			ArrayList<Integer> marks = new ArrayList<Integer>();
			boolean loop = true;
			while (loop) {
				System.out.print("Mark: ");
				int mark = Input.nextInt();
				if (mark == -1) {
					loop = false;
				} else {
					marks.add(mark);
				}
			}
			int sum = 0;
			for (int num : marks) {
				sum += num;
			}
			System.out.printf("Percentage: %.1f%%", (double) sum / marks.size());
		} finally {
			Input.close();
		}

	}

}
