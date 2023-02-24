/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 31 2022
 * Description: Exercise 4 - SIZE
 */


package forLoop3;

public class Ex4_size {

    public static void main(String[] args) {
        final int SIZE = 5;
        for (int i = 1; i <= SIZE; i++) {
            for (int j = SIZE; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
