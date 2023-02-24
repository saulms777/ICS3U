/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Dec 6 2022
 * Description: Exercise 3 - Diagonal Sum
 */

package arrays4;

public class Ex3_diagonalSum {

    public static void main(String[] args) {
        int sum = 1;
        int num = 1;
        int diff = 4;
        while (true) {
            num += diff;
            if (num > 2018) {
                break;
            }
            sum += num;

            num += diff;
            if (num > 2018) {
                break;
            }
            sum += num;
            diff += 4;
        }
        System.out.print(sum);
    }

}
