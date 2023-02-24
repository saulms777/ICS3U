/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Dec 2 2022
 * Description: Arrays 2
 */


import java.util.Scanner;
import java.lang.Math;

public class arrays2 {

    private static boolean firstLast6(String input) {
        String[] array = input.substring(1, input.length() - 1).split(", ");
        return array[0].equals("6") || array[array.length - 1].equals("6");
    }

    private static boolean commonEnd(String input) {
        String[][] arrays = new String[][]{null, null};
        int i = 0;
        for (String array : input.split("; ")) {
            arrays[i] = array.substring(1, array.length() - 1).split(", ");
            i++;
        }
        assert arrays[0] != null;
        assert arrays[1] != null;
        return arrays[0][0].equals(arrays[1][0]) || arrays[0][arrays[0].length - 1].equals(arrays[1][arrays[1].length - 1]);
    }

    private static boolean elementSum(String input) {
        int[][] arrays = new int[][]{null, null};
        String[] strs;
        int[] numbers;
        int i = 0;
        for (String array : input.split("; ")) {
            strs = array.substring(1, array.length() - 1).split(", ");
            numbers = new int[strs.length];
            for (int j = 0; j < strs.length; j++) {
                numbers[j] = Integer.parseInt(strs[j]);
            }
            arrays[i] = numbers;
            i++;
        }
        int[] sums = new int[2];
        for (int j = 0; j < 2; j++) {
            assert arrays[j] != null;
            for (int num : arrays[j]) {
                sums[j] += num;
            }
        }
        return sums[0] == sums[1];
    }

    private static String rotate(String input) {
        String[] array = input.substring(1, input.length() - 1).split(", ");
        String first = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        array[array.length - 1] = first;
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (String num : array) {
            str.append(num);
            str.append(", ");
        }
        str.append("]");
        return str.toString();
    }

    private static int evens(String input) {
        String[] strs = input.substring(1, input.length() - 1).split(", ");
        int[] numbers = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            numbers[i] = Integer.parseInt(strs[i]);
        }
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int bigDifference(String input) {
        String[] strs = input.substring(1, input.length() - 1).split(", ");
        int[] numbers = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            numbers[i] = Integer.parseInt(strs[i]);
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println(firstLast6(sc.nextLine()));
            System.out.println(commonEnd(sc.nextLine()));
            System.out.println(elementSum(sc.nextLine()));
            System.out.println(rotate(sc.nextLine()));
            System.out.println(evens(sc.nextLine()));
            System.out.println(bigDifference(sc.nextLine()));
        }
    }

}
