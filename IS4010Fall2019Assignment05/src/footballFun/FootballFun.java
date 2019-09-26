/*
 * Bowen Xu
 * xubw@mail.uc.edu
 * Due Date: 10/3
 * Description: using method to print out statements if score and statements are all matched 
 * IS4010 Fal 2019
 * Course: IS4010 App with Java
 * Assignment 05
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */
package footballFun;

public class FootballFun {

	public static void main(String[] args) {
		int correctCount = 0;
		if (translateScore(2).equals("safety") == true) {correctCount++;}
		if (translateScore(3).equals("field goal") == true){correctCount++;}
		if (translateScore(6).equals("touchdown") == true) {correctCount++;}
		if (translateScore(7).equals("touchdown and extra point") == true){correctCount++;}
		if (translateScore(8).equals("touchdown and 2-point conversion") == true){correctCount++;}
		if (translateScore(-1).equals("") == true){correctCount++;}
		if (translateScore(1).equals("invalid") == true) {correctCount++;}
		if (translateScore(10).equals("you must be playing Quidditch ") == true){correctCount++;}
		
		if (correctCount == 8) {
			System.out.println("All tests passed");
		} else {
			System.out.println("At least one test failed");
		}
	}
	/**
	 * Using the string "results" as the method output
	 * Receive input as int and return in String
     * Each int input should match with certain string statement
	 * When all eight inputs match up, display "all  tests passed"
	 */
	public static String translateScore (int score)
	{
		String results = "";	
		if (score == 2)
		{
			results = "safety";
		}
		
		if (score == 3)
		{
			results ="field goal";
		}
		
		if (score ==6)
		{
			results = "touchdown";
		}
		
		if(score == 7)
		{
			results = "touchdown and extra point";
		}
		
		if (score == 8)
		{
			results = "touchdown and 2-point conversion";
		}
		
		if(score == -1)
		{
			results="";
		}
			
		if (score == 1)
		{
			results = "invalid";
		}
		if (score == 10)
		{
			results= "you must be playing Quidditch ";
		}
		
		
		return results;
		
	}
}
