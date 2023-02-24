/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 12 2022
 * Description: Exercise 3 - Interest
 */

package randomMath3;

import java.util.Scanner;
import java.text.NumberFormat;
import java.lang.Math;
import java.util.Random;

public class Ex3_interest {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		NumberFormat Money = NumberFormat.getCurrencyInstance();
		Random Rand = new Random();
		
		try {
			System.out.print("Amount to invest: ");
			double principal = Input.nextDouble();
			System.out.print("Number of years: ");
			double years = Input.nextDouble();
			double rate = Rand.nextInt(50) / 10.0 + 0.1;
			
			double total = principal * Math.pow(1 + rate / 100.0, years);
			double interest = total - principal;
			
			System.out.printf("Principal: %s\nInterest: %s\nTotal: %s", Money.format(principal), Money.format(interest), Money.format(total));
			
		} finally {
			Input.close();
		}

	}

}
