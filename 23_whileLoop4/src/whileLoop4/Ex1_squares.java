/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 17 2022
 * Description: Exercise 1 - Sequence of squares
 */

package whileLoop4;

public class Ex1_squares {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while (num < 26) {
			System.out.println(num * num);
			sum += num * num;
			num++;
		}
		System.out.print(sum);

	}

}
