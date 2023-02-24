/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sept 30 2022
 * Description: Programming Assessment 1 - Rock Paper Scissors
 */


package programmingAssesment1;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		Random Rand = new Random();
		
		/*
		 * 0 = Rock
		 * 1 = Paper
		 * 2 = Scissors
		 */
		
		// Game explanation and player input
		System.out.print("This is a Rock Paper Scissors game."
				+ "\nYou will be playing against the computer."
				+ "\nEnter 0 for Rock, 1 for Paper and 2 for Scissors."
				+ "\nYour action: ");
		int player = Input.nextInt();
		// Randomized computer action
		int computer = Rand.nextInt(3);
		System.out.println("Computer action: " + computer);
		
		// Determine if player won, lost, or tied
		if ((player + 1) % 3 == computer) {
			System.out.println("You lose");
		} else if (player == computer) {
			System.out.println("Tie");
		} else {
			System.out.println("You win");
		}
		
		// Close Scanner object
		Input.close();

	}

}
