/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 24 2022
 * Description: Answer Key
 */


package methods4;

import java.util.Scanner;
import java.util.Random;

public class AnswerKey {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * Asks user for the a positive number of questions
     *
     * @return <code>int</code> - Amount of questions to ask
     */
    private static int getQuestionAmount() {
        int amount;
        do {
            System.out.print("Choose number of questions: ");
            amount = sc.nextInt();
        } while (amount <= 0);
        System.out.println();
        return amount;
    }

    /**
     * Creates a random answer key
     * <p>
     *     The answer key will have length (amount) and will have the following possible letters:
     *     'a', 'b', 'c', 'd', and 'e'. The answer key will be returned in the form of a String.
     * </p>
     *
     * @param amount Length of the answer key
     * @return <code>String</code> - Answer key
     */
    private static String createKey(int amount) {
        Random r = new Random();
        StringBuilder answers = new StringBuilder();
        for (int i = 0; i < amount; i++) {
            answers.append((char) ('a' + r.nextInt(5)));
        }
        return answers.toString();
    }

    /**
     * Takes user input for a guess of the answer key
     * <p>
     *     The student will input either a letter from the answer key pool ('a', 'b', 'c', 'd', 'e') or '?'
     *     if they wish to not answer. If the user enters anything else, an error message is displayed.
     *     The student's answers will be returned in the form of a String.
     * </p>
     *
     * @param amount Amount of answers
     * @return <code>String</code> - User's answers
     */
    private static String getStudentAnswer(int amount) {
        StringBuilder student = new StringBuilder();
        for (int i = 1; i <= amount; i++) {
            char letter;
            do {
                System.out.printf("Enter answer to %d: ", i);
                letter = sc.next().charAt(0);
                if ((letter < 'a' || letter > 'e') && letter != '?') {
                    System.out.print("Invalid. ");
                }
            } while ((letter < 'a' || letter > 'e') && letter != '?');
            student.append(letter);
        }
        return student.toString();
    }

    /**
     * Prints the answer key with delimeter ', ' and a specified prefix
     *
     * @param prefix Prefix to print first
     * @param answers String of the answer key
     */
    private static void display(String prefix, String answers) {
        System.out.printf("%s%s\n", prefix, String.join(", ", answers.split("")));
    }

    /**
     * Prints user's answers with delimeter ', '
     *
     * @param answers String of user's answers
     */
    private static void display(String answers) {
        System.out.printf("Your answers are: %s\n", String.join(", ", answers.split("")));
    }

    /**
     * Calculates and prints out the user's score
     * <p>
     *     Compares the user's answers with the answer key to calculate the score.
     *     The score is calculated as follows:
     *     <br>Correct answer: +4 points
     *     <br>Wrong answer: -1 point
     *     <br>No answer: 0 points
     *     <br>The user's score will be printed out of the total points possible
     * </p>
     *
     * @param key String of the answer key
     * @param user Sring of user's answers
     */
    private static void showScore(String key, String user) {
        int score = 0;
        for (int i = 0; i < key.length(); i++) {
            if (user.charAt(i) == '?') {
                score += 0;
            }
            else if (key.charAt(i) == user.charAt(i)) {
                score += 4;
            } else {
                score -= 1;
            }
        }
        System.out.printf("Your score is: %d/%d", score, key.length() * 4);
    }

    /**
     * Main method for program
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        /*
         * Ask user how many questions there are
         * Question number must be a positive number
         */
        int qAmount = getQuestionAmount();

        /*
         * The answer key will be a String with (qAmount) of letters
         * Possible letters: a, b, c, d, e
         * Example: "abbd"
         */
        String answerKey = createKey(qAmount);

        /*
         * Ask user to guess the answer key one key at a time
         * User's answer will be stored in a String in the same way answerKey is stored
         * If user enters an invalid letter print an error message and continue
         * Valid letters: a, b, c, d, e, ? (no answer)
         */
        String userAnswer = getStudentAnswer(qAmount);

        /*
         * display() should be an overloaded method:
         * display(String displayPrefix, String answerKey) will print out the answer key
         * display(String userAnswer) will print out the user's answers
         *
         * Both answers will be printed out separated by a comma
         */
        display("\nAnswer key is: ", answerKey);
        display(userAnswer);

        /*
         * Display user's score out of total possible points
         * Correct: 4 points
         * Wrong: -1 point
         * No answer: 0 points
         * Number of points cannot be less than 0
         */
        showScore(answerKey, userAnswer);
    }

}
