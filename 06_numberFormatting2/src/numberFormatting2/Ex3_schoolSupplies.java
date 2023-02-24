/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 12 2022
 * Description: Exercise 3 - School Supplies
 */

package numberFormatting2;

import java.util.Scanner;
import java.text.NumberFormat;

public class Ex3_schoolSupplies {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		NumberFormat Money = NumberFormat.getCurrencyInstance();
		
		try {
			System.out.println("Cost of items:");
			System.out.println("Pencil: $0.15");
			System.out.println("Eraser: $0.25");
			System.out.println("Marker: $0.30");
			
			System.out.println("\nEnter amount to buy:");
			System.out.print("Pencils: ");
			int pencils = Input.nextInt();
			System.out.print("Erasers: ");
			int erasers = Input.nextInt();
			System.out.print("Markers: ");
			int markers = Input.nextInt();
			
			double pencilCost = pencils * 0.15;
			double eraserCost = erasers * 0.25;
			double markerCost = markers * 0.30;
			double taxCost = (pencilCost + eraserCost + markerCost) * 0.13;
			double total = pencilCost + eraserCost + markerCost + taxCost;
			
			System.out.print("\nReceipt:");
			System.out.printf("\nPencil:     %s", Money.format(pencilCost));
			System.out.printf("\nEraser:     %s", Money.format(eraserCost));
			System.out.printf("\nMarker:     %s", Money.format(markerCost));
			System.out.printf("\nTaxes:      %s", Money.format(taxCost));
			System.out.printf("\nTotal Cost: %s", Money.format(total));
			
			System.out.print("\n\nMoney paid: ");
			double moneyPaid = Input.nextDouble();
			double change = moneyPaid - total;
			System.out.printf("Change: %s", Money.format(change));
		} finally {
			Input.close();
		}

	}

}
