/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sept 30 2022
 * Description: Programming Assessment 2 - Courses
 */


package programmingAssessment2;

// import Random class
import java.util.Random;

public class Courses {

	public static void main(String[] args) {
		// Declare and initialize Random object
		Random Rand = new Random();
		
		// Set number of courses to a number between 1 and 10 (inclusive)
		int courses = 1 + Rand.nextInt(10);
		// If number of courses is 8 or more display "You have a full timetable"
		if (courses >= 8) {
			System.out.println("You have a full timetable.");
			// If number of courses is 10 display "Good luck"
			if (courses == 10) {
				System.out.println("Good luck.");
			}
		// If number of courses is from 5 to 7 (inclusive) display "You have some extra time"
		} else if (courses >= 5 && courses <= 7) {
			System.out.println("You have some extra time.");
		// If number of courses is less than 5 display "You are a part time student"
		} else {
			System.out.println("You are a part time student.");
		}

	}

}
