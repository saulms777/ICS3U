/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 17 2022
 * Description: Exercise 2 - Sequence of fractions
 */


package whileLoop4;

public class Ex2_fractions {

	public static void main(String[] args) {
		int num = 0;
		double sum = 0.0;
		while (num < 25) {
			if (num % 2 == 0) {
				sum += 1.0 / (2 * num + 1);
			} else {
				sum -= 1.0 / (2 * num + 1);
			}
			System.out.println(4 * sum);
			num++;
		}
		System.out.print("The number converges to pi");

	}

}
