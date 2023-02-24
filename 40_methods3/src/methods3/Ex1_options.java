/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 23 2022
 * Description: Exercise 1 - Options
 */


package methods3;

import java.util.Scanner;
import java.util.Random;

public class Ex1_options {

    private static final Scanner sc = new Scanner(System.in);
    private static int points = 0;

    /**
     * Takes user input for option
     * <p>
     *     The method will ask for an option to choose.
     *     If the user enters a number out of range (1 to 4) the method will show an error message and run again.
     *     This repeats until the user enters a valid number.
     * </p>
     *
     * @return <code>int</code> - Returns a number corresponding to each option
     */
    private static int userInput() {
        System.out.print("Option: ");
        int input;
        while (true) {
            input = sc.nextInt();
            if (input >= 1 && input <= 4) {
                return input;
            }
            System.out.println("Number is not in range. Please try again");
        }
    }

    /**
     * Asks the user an addition question
     * <p>
     *     The numbers in the addition question will be between 10 and 20.
     *     If the user enters correctly the user will gain one point.
     * </p>
     */
    private static void addition() {
        Random rand = new Random();
        int n1 = 10 + rand.nextInt(11);
        int n2 = 10 + rand.nextInt(11);
        System.out.printf("%d + %d = ", n1, n2);
        if (sc.nextInt() == n1 + n2) {
            System.out.println("Correct.");
            points++;
        } else {
            System.out.println("Incorrect.");
        }
    }

    /**
     * Asks user for a word and prints the number of vowels
     * <p>
     *     For each vowel in the word, one point will be added to the user's point count.
     * </p>
     */
    private static void vowels() {
        int count = 0;
        System.out.print("Enter a name: ");
        for (char letter : sc.next().toCharArray()) {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                count++;
            }
        }
        System.out.printf("Number of vowels: %d", count);
        points += count;
    }

    /**
     * Prints the number of points the user currently has
     */
    private static void points() {
        System.out.printf("Number of points: %d\n", points);
    }

    /**
     * Main method for program
     * <p>
     *     The method will print out a list of options for the user to choose from:
     *     <br>Option 1: Ask a random addition question with numbers between 10 and 20
     *     <br>Option 2: User enters a name and gets the number of vowels in the name
     *     <br>Option 3: Prints the user's score
     *     <br>Option 4: Exits the program
     *     <br>
     *     <br>The game will run until option 4 is entered, in which case the program terminates.
     * </p>
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        System.out.print(
                """
                Option 1: Get a random addition question with numbers between 10 and 20
                Option 2: Enter a name and get in return the number of vowels in the name
                Option 3: Determine your score
                Option 4: Exit
                """);
        boolean loop = true;
        while (loop) {
            switch (userInput()) {
                case 1 -> addition();
                case 2 -> vowels();
                case 3 -> points();
                case 4 -> loop = false;
            }
        }
        sc.close();
    }

}
