/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 23 2022
 * Description: Exercise 2 - Phrase
 */


package methods3;

import java.util.Scanner;

public class Ex2_phrase {

    /**
     * Capitalizes the first letter of a phrase
     *
     * @param str Phrase to capitalize
     * @return <code>String</code> - Capitalized phrase
     */
    private static String capital(String str) {
        return str.toUpperCase().charAt(0) + str.substring(1);
    }

    /**
     * Counts and returns the number of spaces in a phrase
     *
     * @param str Phrase to count spaces from
     * @return <code>int</code> - Number of spaces in the phrase
     */
    private static int spaces(String str) {
        int count = 0;
        for (char letter : str.toCharArray()) {
            if (letter == ' ') {
                count++;
            }
        }
        return count;
    }

    /**
     * Checks if a phrase has more vowels than consonants
     * <p>
     *     This method will return:
     *     0 - If the number of vowels is more than the number of consonants
     *     1 - If the number of vowels is equal to the number of consonants
     *     2 - If the number of vowels is less than the number of consonants
     * </p>
     *
     * @param str Phrase to count number of vowels
     * @return <code>int</code> - Number based on the number of vowels
     */
    private static int moreVowels(String str) {
        int count = 0;
        for (char letter : str.toCharArray()) {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                count++;
            }
        }
        if (count > (str.length() - spaces(str)) / 2.0) {
            return 0;
        } else if (count == (str.length() - spaces(str)) / 2.0) {
            return 1;
        } else {
            return 2;
        }
    }

    /**
     * Main method for program
     * <p>
     *     This method will take in a phrase as user input and call the above three methods on it.
     *     The phrase is first capitalized, then the method will print out the number of spaces in the function,
     *     and then it will tell the user the relationship between the number of vowels and consonants.
     * </p>
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a phrase: ");
            String phrase = sc.nextLine();
            System.out.printf("Capitalized phrase:\n%s\n", capital(phrase));
            System.out.printf("Number of spaces: %d\n", spaces(phrase));
            switch (moreVowels(phrase)) {
                case 0 -> System.out.print("There are more vowels than consonants");
                case 1 -> System.out.print("There are an equal number of vowels and consonants");
                case 2 -> System.out.print("There are more consonants than vowels");
            }
        }
    }

}
