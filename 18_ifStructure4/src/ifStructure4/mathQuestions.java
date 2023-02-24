package ifStructure4;

import java.util.Scanner;
import java.util.Random;

public class mathQuestions {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int rand7 = rand.nextInt(100);
		int rand8 = rand.nextInt(100);
		int rand9 = rand.nextInt(100);
		int rand10 = rand.nextInt(100);
		int score = 0;
		
		System.out.printf("\nQuestion: %d / %d = ?\nAnswer (8 decimal digits): ", rand7, rand8);
		if (input.nextInt() == rand7 / rand8) {
			System.out.println("You have the correct answer");
			score++;
		} else {
			System.out.println("You have the wrong answer");
			score--;
			System.out.printf("Your new score is %d", score);
		}
		System.out.printf("\nQuestion: %d %s %d = ?\nAnswer: ", rand9, "%", rand10);
		if (input.nextInt() == rand9 % rand10) {
			System.out.println("You have the correct answer");
			score++;
		} else {
			System.out.println("You have the wrong answer");
			score--;
			System.out.printf("Your new score is %d", score);
		}
		
		System.out.printf("\nFinal score: %d", score);
		
		input.close();

	}

}
