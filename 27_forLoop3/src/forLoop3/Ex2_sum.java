/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Oct 31 2022
 * Description: Exercise 2 - Sum
 */


package forLoop3;

public class Ex2_sum {

    public static void main(String[] args) {
        double sum = 0.0;
        for (int el = 1; el <= 1000; el++) {
            sum += 1.0 / el;
        }
        System.out.println(sum);

        sum = 0.0;
        int el = 1;
        while (el <= 1000) {
            sum += 1.0 / el;
            el++;
        }
        System.out.println(sum);
    }
}
