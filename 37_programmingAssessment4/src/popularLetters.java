/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 17 2022
 * Description: Programming Assessment 4 - Popular Letters
 */


// import Scanner class
import java.util.Scanner;

// define class
public class popularLetters {

    // driver code
    public static void main(String[] args) {

        // create a Scanner object
        Scanner sc = new Scanner(System.in);

        // runs phrase program three times
        for (int phraseNum = 1; phraseNum <= 3; phraseNum++) {

            // user input for phrase
            System.out.print("Enter phrase #" + phraseNum + ": ");
            String phrase = sc.nextLine();

            // user input for character to remove
            System.out.print("Enter a character to remove: ");
            char letter = sc.next().toLowerCase().charAt(0);
            sc.nextLine();

            // loop through each character of the phrase
            int count = 0;
            String newString = "";
            for (int el = 0; el < phrase.length(); el++) {

                // if character matches character to remove increase count number
                if (phrase.toLowerCase().charAt(el) == letter) {
                    count++;

                // else add character to new String
                } else {
                    newString += phrase.charAt(el);
                }
            }

            // print new String
            System.out.println(newString);

            // no characters were removed
            if (count == 0) {
                System.out.println("No letter \"" + letter + "\"s were removed.");

            // one or two characters were removed
            } else if (count == 1 || count == 2) {
                System.out.println("There were a couple letter \"" + letter + "\"s removed.");

            // three or more characters were removed
            } else {
                System.out.println("There were a few letter \"" + letter + "\"s removed.");
            }
        }

        // close Scanner object
        sc.close();
    }
}
