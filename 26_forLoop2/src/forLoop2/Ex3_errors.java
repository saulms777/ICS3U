/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 20 2022
 * Description: Exercise 3 - Errors
 */


package forLoop2;

public class Ex3_errors {

	public static void main(String[] args) {
		// missing "n++" increment
		for (int n = 0; n < 10; n++) {
			System.out.println(n);
		}
		
		// "n--" will loop indefinitely
		for (int n = 0; n < 10; n++) {
			System.out.println(n);
		}
		
		// m is not a valid variable
		for (int n = 0; n < 10; n++) {
			System.out.println(n);
		}

	}

}
