/*
 * Name: Samuel Zhang
 * Course: ICS3U
 * Date: Sep 8 2022
 * Description: Exercise 3 - Temperature Converter
 */


package variablesPractice;

import java.util.Scanner;

public class Ex3_TemperatureConverter {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		try {
			System.out.print("Temperature: ");
			String userInput = Input.nextLine();
			
			String[] inputParts = userInput.split(" ");
			double temperatureValue = Double.valueOf(inputParts[0]);
			char temperatureType = inputParts[1].charAt(0);
			
			double convertedTemperature = 0.0;
			if (temperatureType == 'C') {
				convertedTemperature = temperatureValue * 9 / 5 + 32;
				temperatureType = 'F';
			} else {
				convertedTemperature = (temperatureValue - 32) * 5 / 9;
				temperatureType = 'C';
			}
			
			System.out.printf("Temperature in %s: %f", temperatureType, convertedTemperature);
		} finally {
			Input.close();
		}

	}

}
