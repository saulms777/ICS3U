/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 20 2022
 * Description: Exercise 2 - 3 to 19
 */


package forLoop2;

public class Ex2_threeToNineteen {

	public static void main(String[] args) {
		int product = 1;
		for (int el = 3; el <= 19; el += 2) {
			product *= el;
		}
		System.out.print(product);

	}

}
