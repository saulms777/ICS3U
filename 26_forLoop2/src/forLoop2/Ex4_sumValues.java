/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 20 2022
 * Description: Exercise 4 - Sum of values
 */


package forLoop2;

import java.util.Scanner;

public class Ex4_sumValues {
	
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("Lower number: ");
			int min = Input.nextInt();
			System.out.print("Higher number: ");
			int max = Input.nextInt();
			
			int sum = 0;
			for (int el = min; el <= max; el++) {
				sum += el;
				System.out.println(sum);
			}
		} finally {
			Input.close();
		}
	
	}

}
