/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 12 2022
 * Description: Exercise 4 - Sequence
 */


package randomMath4;

import java.util.Scanner;
import java.util.Random;

public class Ex4_sequence {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		Random Rand = new Random();
		
		try {
			int a1 = 5 + Rand.nextInt(11);
			int d = 1 + Rand.nextInt(10);
			
			System.out.print("Term to calculate: ");
			int n = Input.nextInt();
			
			int an = a1 + d * (n - 1);
			System.out.printf("Value of nth term with starting value %d and step %d: %d", a1, d, an);
		} finally {
			Input.close();
		}

	}

}
