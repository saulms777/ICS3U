/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 28 2022
 * Description: Exercise 1 - Mixing Strings
 */


package methods5;

import java.util.Scanner;
import java.lang.Math;

public class Ex1_mixingStrings {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * Combines two Strings and outputs a "mixed" String
     * <p>
     *     The mixed String will be a combination of each letter of the original Strings,
     *     with each letter of the two original Strings alternating to create the new String.
     *     If one String is longer than the other the remainder of the longer String will be appended
     *     to the end of the mixed String.
     * </p>
     *
     * @param str1 First String
     * @param str2 Second String
     * @return <code>String</code> - Mixed String
     */
    private static String mix(String str1, String str2) {
        StringBuilder mixed = new StringBuilder();
        for (int i = 0; i < Math.max(str1.length(), str2.length()); i++) {
            if (i < str1.length()) {
                mixed.append(str1.charAt(i));
            }
            if (i < str2.length()) {
                mixed.append(str2.charAt(i));
            }
        }
        return mixed.toString();
    }

    /**
     * Checks if a String is not "Exit"
     *
     * @param str String to check
     * @return <code>boolean</code> - True if not "Exit" else false
     */
    private static boolean notExit(String str) {
        return !str.equals("Exit");
    }

    /**
     * Takes two Strings as input and mixes them
     * <p>
     *     Calls the mix(String str1, String str2) method on the two inputs and prints the output.
     *     If "Exit" is entered for either of the Strings, the method will return false,
     *     otherwise it will return true.
     * </p>
     *
     * @return <code>boolean</code> - True if no "Exit" else false
     */
    private static boolean userInput() {
        System.out.print("First string: ");
        String str1 = sc.nextLine();
        if (notExit(str1)) {
            System.out.print("Second string: ");
            String str2 = sc.nextLine();
            if (notExit(str2)) {
                System.out.printf("Mixed string: %s\n", mix(str1, str2));
                return true;
            }
        }
        return false;
    }

    /**
     * Loops through the main method until "Exit" is inputted
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        boolean loop;
        do {
            loop = userInput();
        } while (loop);
        System.out.print("Goodbye");
    }

}
