package utils.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class UserUtil {

	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static <T> T choose(String question, List<T> acceptableAnswers) {
		int choice = -1;
		String input = "";
		String choiceString;
		do {
			System.out.println(question);
			for(T choiceThing : acceptableAnswers)
			{
				choiceString = choiceThing.toString();
				System.out.println((1+acceptableAnswers.indexOf(choiceThing))+") " + choiceString);
			}
			try
			{
				input = br.readLine();
				choice = Integer.parseInt(input);
			}
			catch (NumberFormatException | IOException e)
			{
				System.out.println("Please type a number from the listed options.");
			}
		} while ( choice <= 0 || choice > acceptableAnswers.size());
		
		return acceptableAnswers.get(choice-1);
		
	}
	
	public static String ask(String question) {
		String input = "";
		do {
			System.out.println(question);
			try
			{
				input = br.readLine();
				return input;
			}
			catch (IOException e)
			{
				System.out.println("Sorry, I didnt catch that.");
			}
		} while ( true );
	}
	
}
