/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 12 2022
 * Description: Exercise 4 - Sleep
 */


package numberFormatting1;

import java.util.Scanner;
import java.text.NumberFormat;

public class Ex4_sleep {
	
	static int findDays(int year, int month, int day) {
		final int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int yearDays = year * 365 + year / 4 - year / 100 + year / 400;
		
		int monthDays = 0;
		int el = 0;
		while (el < month) {
			monthDays += daysInMonth[el];
			el++;
		}
		
		return (yearDays + monthDays + day);
	}
	
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		NumberFormat Integer = NumberFormat.getIntegerInstance();
		
		try {
			System.out.println("Enter birthdate:");
			System.out.print("Year: ");
			int birthYear = Input.nextInt();
			System.out.print("Month: ");
			int birthMonth = Input.nextInt();
			System.out.print("Day: ");
			int birthDay = Input.nextInt();
			int birthDays = findDays(birthYear, birthMonth, birthDay);
			
			System.out.println("\nEnter today's date:");
			System.out.print("Year: ");
			int currentYear = Input.nextInt();
			System.out.print("Month: ");
			int currentMonth = Input.nextInt();
			System.out.print("Day: ");
			int currentDay = Input.nextInt();
			int currentDays = findDays(currentYear, currentMonth, currentDay);
			
			System.out.print("\nHours slept on average per night: ");
			int averageHours = Input.nextInt();
			
			System.out.printf("\nYou have slept for %s hours.", Integer.format(averageHours * (currentDays - birthDays)));
		} finally {
			Input.close();
		}

	}

}
