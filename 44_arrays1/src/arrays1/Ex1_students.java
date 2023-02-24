/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Nov 29 2022
 * Description: Exercise 1 - Students
 */


package arrays1;

import java.util.Scanner;

public class Ex1_students {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Number of students: ");
            String[] students = new String[sc.nextInt()]; sc.nextLine();
            for (int i = 0; i < students.length; i++) {
                System.out.printf("Student #%d's name: ", i + 1);
                students[i] = sc.nextLine();
            }
            System.out.printf("Student list: %s", String.join(", ", students));
        }
    }

}
