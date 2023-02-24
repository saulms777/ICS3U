/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 20 2022
 * Description: Exercise 5 - a b c
 */


package forLoop2;

public class Ex5_abc {

	public static void main(String[] args) {
		// initialization of b and c cannot be inside the for loop
		int a, b, c;
		b = 20;
		c = 33;
		for (a = 10; a + b < c; a++) {
			System.out.println("true");
		}

	}

}
