/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sept 22 2022
 * Description: Exercise 4 - Temperature
 */

package planning4;

import java.util.Scanner;

public class Ex4_temperature {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("Temperature of today: ");
			int temperature = Input.nextInt();
			
			if (temperature < 10) {
				System.out.print("Today is cold");
			} else if (temperature >= 10 && temperature <= 20) {
				System.out.print("Today is cloudy");
			} else {
				System.out.print("Today is hot");
			}
		} finally {
			Input.close();
		}

	}

}
