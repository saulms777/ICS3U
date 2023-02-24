/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Dec 6 2022
 * Description: Programming Assessment 6 - Hiding Characters
 */


import java.util.Scanner;

public class HidingCharacters {

    /**
     * Creates an int array with user specified length and values
     * <p>
     *     Ask user for length of array, and if it is negative ask again until the length is positive.
     *     For each element in the array ask user to input the value for that index.
     * </p>
     *
     * @return <code>int[]</code> - created array
     */
    private static int[] makeArray() {
        Scanner sc = new Scanner(System.in);

        int len;
        do {
            System.out.print("Enter length of array: ");
            len = sc.nextInt();
        } while (len < 1);

        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print("Enter element: ");
            array[i] = sc.nextInt();
        }

        return array;
    }

    /**
     * Checks if all ints in a given array is positive
     *
     * @param array array to check
     * @return <code>boolean</code> - true if array is all positive else false
     */
    private static boolean allPositive(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Calculates the average of a given array
     *
     * @param array array to calculate average of
     * @return <code>double</code> - average of all elements in the array
     */
    private static double avg(int[] array) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return (double) total / array.length;
    }

    /**
     * Displays a prefix String and then the values of an array separated by delimiter ", "
     *
     * @param str prefix to print before the array
     * @param array array to print values of
     */
    private static void display(String str, int[] array) {
        System.out.print(str);
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[array.length - 1]);
    }

    /**
     * Creates an array and performs actions based on its values
     * <p>
     *     Uses the makeArray() method to create an int array. If the array is composed of
     *     only positive numbers, calculate and display the average of the values in the array.
     *     If the numbers are not all positive, use the display(String str, int[] array) method
     *     to display the values of the array.
     * </p>
     *
     * @param args Unused
     */
    public static void main(String[] args) {
        int[] arr = makeArray();
        if (allPositive(arr)) {
            System.out.println("Avg is: " + avg(arr));
        } else {
            display("Array is: ", arr);
        }
    }

}
