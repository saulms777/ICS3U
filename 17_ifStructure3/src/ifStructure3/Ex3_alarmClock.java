/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sept 27 2022
 * Description: Exercise 3 - Alarm clock
 */


package ifStructure3;

import java.util.Scanner;

public class Ex3_alarmClock {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			boolean vacation;
			System.out.print("Are you on vacation? (1/0) ");
			if (Input.nextInt() == 1) {
				vacation = true;
			} else {
				vacation = false;
			}
			
			System.out.print("What day of the week is it (0/1/2/3/4/5/6) ");
			if (Input.nextInt() % 6 == 0) {
				if (vacation) {
					System.out.print("No alarm");
				} else {
					System.out.print("Alarm at 10:00 am");
				}
			} else {
				if (vacation) {
					System.out.print("Alarm at 10:00 am");
				} else {
					System.out.print("Alarm at 7:00 am");
				}
			}
		} finally {
			Input.close();
		}

	}

}
