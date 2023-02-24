/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 20 2022
 * Description: Exercise 9 - Countdown
 */


package forLoop2;

import java.util.Scanner;

public class Ex9_countdown {
	
	public static void main(String[] args) {

		try (Scanner Input = new Scanner(System.in)) {
			for (int el = 10; el > 0; el--) {
				boolean loop = true;
				while (loop) {
					System.out.printf("There is %d left\n", el);
					String readLine = Input.nextLine();
					if (readLine.equals("")) {
						loop = false;
					}
				}
			}
			System.out.print("DONE");
		}
	
	}

}
