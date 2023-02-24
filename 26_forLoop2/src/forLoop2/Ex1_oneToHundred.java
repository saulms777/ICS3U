/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 20 2022
 * Description: Exercise 1 - 1 to 100
 */


package forLoop2;

public class Ex1_oneToHundred {

	public static void main(String[] args) {
		int sum = 0;
		for (int el = 1; el <= 100; el++) {
			sum += el;
		}
		System.out.print(sum);

	}

}
