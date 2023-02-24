/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sept 26 2022
 * Description: Exercise 3 - Package deliver
 */


package ifStructure2;

import java.util.Scanner;

public class Ex3_packageDeliver {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("Length: ");
			int length = Input.nextInt();
			System.out.print("Width: ");
			int width = Input.nextInt();
			System.out.print("Height: ");
			int height = Input.nextInt();
			
			int volume = length * width * height;
			if (length < 10 && width < 10 && height < 10 && volume < 500) {
				System.out.print("Accepted");
			} else {
				System.out.print("Rejected");
			}
		} finally {
			Input.close();
		}

	}

}
