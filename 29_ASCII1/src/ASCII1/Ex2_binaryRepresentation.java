/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 3 2022
 * Description: Exercise 2 - Binary Representation
 */


package ASCII1;

public class Ex2_binaryRepresentation {

    public static void main(String[] args) {
        for (char character : "Comp. Sci. is fun!".toCharArray()) {
            System.out.printf("%s ", Integer.toBinaryString(character));
        }
    }
}
