/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 23 2022
 * Description: Exercise 3 - Not or Is
 */


package methods3;

import java.util.Scanner;

public class Ex3_notOrIs {

    /**
     * Counts and returns the number of times a substring occurs in a given phrase
     *
     * @param phrase Phrase to count substring occurrences
     * @param substr Substring to find number of occurrences
     * @return <code>int</code> - Number of times substring occurs in phrase
     */
    private static int occurrences(String phrase, String substr) {
        int index;
        int count = 0;
        while (phrase.contains(substr)) {
            index = phrase.indexOf(substr) + substr.length();
            phrase = phrase.substring(index);
            count++;
        }
        return count;
    }

    /**
     * Prints the relationship between the number of 'not's and 'is's
     * <p>
     *     Takes in a phrase as user input and will print a message based on the number of 'not's and 'is's
     * </p>
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a phrase: ");
            String str = sc.nextLine();
            int not = occurrences(str, "not");
            int is = occurrences(str, "is");
            if (not < is) {
                System.out.print("There are less 'not's than 'is'.");
            } else if (not == is) {
                System.out.print("There are an equal number of 'not's and 'is's.");
            } else {
                System.out.print("There are more 'not's than 'is'.");
            }
        }
    }

}
