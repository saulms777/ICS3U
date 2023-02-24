/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 12 2022
 * Description: Exercise 2 - Percent of Time
 */


package numberFormatting2;

import java.util.Scanner;
import java.text.NumberFormat;

public class Ex2_percentOfTime {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		NumberFormat Percent = NumberFormat.getPercentInstance();
		
		try {
			System.out.println("Enter the number of minutes you spend on:");
			System.out.print("Designing: ");
			int designingMin = Input.nextInt();
			System.out.print("Coding: ");
			int codingMin = Input.nextInt();
			System.out.print("Debugging: ");
			int debuggingMin = Input.nextInt();
			System.out.print("Testing: ");
			int testingMin = Input.nextInt();
			
			double totalMin = designingMin + codingMin + debuggingMin + testingMin;
			double designingPercent = designingMin / totalMin;
			double codingPercent = codingMin / totalMin;
			double debuggingPercent = debuggingMin / totalMin;
			double testingPercent = testingMin / totalMin;
			
			System.out.print("\nTask         Time%");
			System.out.printf("\nDesigning    %s", Percent.format(designingPercent));
			System.out.printf("\nCoding       %s", Percent.format(codingPercent));
			System.out.printf("\nDebugging    %s", Percent.format(debuggingPercent));
			System.out.printf("\nTesting      %s", Percent.format(testingPercent));
		} finally {
			Input.close();
		}

	}

}
