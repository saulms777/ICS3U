/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 14 2022
 * Description: Programming Assessment 1 - Furniture
 */

package programmingAssesment1;

import java.util.Scanner;
import java.text.NumberFormat;

public class Furniture {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		NumberFormat Money = NumberFormat.getCurrencyInstance();
		
		System.out.print("Price of chair: ");
		double chairPrice = Input.nextDouble();
		System.out.print("Number of chairs bought: ");
		int chairs = Input.nextInt();
		System.out.print("Price of table: ");
		double tablePrice = Input.nextDouble();
		System.out.print("Number of tables bought: ");
		int tables = Input.nextInt();
		
		double costChairs = chairPrice * chairs;
		double costTables = tablePrice * tables;
		double subtotal = costChairs + costTables;
		final double taxPercent = 0.13;
		double tax = subtotal * taxPercent;
		double total = subtotal + tax;
		double change = 1000.0 - total;
		
		System.out.println("\nReceipt:");
		System.out.println("Cost of chairs: " + Money.format(costChairs));
		System.out.println("Cost of tables: " + Money.format(costTables));
		System.out.println("Subtotal: " + Money.format(subtotal));
		System.out.println("Tax: " + Money.format(tax));
		System.out.println("Total: " + Money.format(total));
		System.out.println("Change given: " + Money.format(change));
		
		Input.close();

	}

}
