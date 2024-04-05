//Switch Statement college assignment for Java Programming 1
//Date 10/07/2021
//Description: Get the user's input to determine their Zodiac Sign using a switch statement.

//create user input
import java.util.Scanner;

public class Zodiac_Sign_Switch_Statement_Assignment {
	public static void main(String[] args) {
		//create scanner variable
		Scanner userInput = new Scanner(System.in);
		
		//prompt user for input
		System.out.println("Enter month number you were born to discover your Zodiac Sign: ");
		//get month from user
		int month = userInput.nextInt();
		
		switch (month) { //determine which Zodiac sign belongs to which month
		case 1: 
			System.out.println("You are a: Capricorn or Aquarius"); //1 = January
			//prompt user for input a specific day
			System.out.println("Enter the day you were born: ");
			//get day from user
			int day1 = userInput.nextInt();
			//if the day is less than or equal to 19 they are the first option, if they are more than they are the second option
			if (day1 <= 19) {
				System.out.println("You are a Capricorn!");
			}else {
				System.out.println("You are an Aquarius!");
			}
			break;
		case 2: 
			System.out.println("You are a: Aquarius or Pisces"); //2 = February
			//prompt user for input a specific day
			System.out.println("Enter the day you were born: ");
			//get day from user
			int day2 = userInput.nextInt();
			//if the day is less than or equal to 18 they are the first option, if they are more than they are the second option
			if (day2 <= 18) {
				System.out.println("You are a Aquarius!");
			}else {
				System.out.println("You are an Pisces!");
			}
			break;
		case 3: 
			System.out.println("You are a: Pisces or Aries"); //3 = March
			//prompt user for input a specific day
			System.out.println("Enter the day you were born: ");
			//get day from user
			int day3 = userInput.nextInt();
			//if the day is less than or equal to 20 they are the first option, if they are more than they are the second option
			if (day3 <= 20) {
				System.out.println("You are a Pisces!");
			}else {
				System.out.println("You are an Aries!");
			}
			break;
		case 4: 
			System.out.println("You are a: Aries or Taurus"); //4 = April
			//prompt user for input a specific day
			System.out.println("Enter the day you were born: ");
			//get day from user
			int day4 = userInput.nextInt();
			//if the day is less than or equal to 19 they are the first option, if they are more than they are the second option
			if (day4 <= 19) {
				System.out.println("You are a Aries!");
			}else {
				System.out.println("You are an Taurus!");
			}
			break;
		case 5: 
			System.out.println("You are a: Taurus or Gemini"); //5 = May
			//prompt user for input a specific day
			System.out.println("Enter the day you were born: ");
			//get day from user
			int day5 = userInput.nextInt();
			//if the day is less than or equal to 20 they are the first option, if they are more than they are the second option
			if (day5 <= 20) {
				System.out.println("You are a Taurus!");
			}else {
				System.out.println("You are an Gemini!");
			}
			break;
		case 6: 
			System.out.println("You are a: Gemini or Cancer"); //6 = June
			//prompt user for input a specific day
			System.out.println("Enter the day you were born: ");
			//get day from user
			int day6 = userInput.nextInt();
			//if the day is less than or equal to 20 they are the first option, if they are more than they are the second option
			if (day6 <= 20) {
				System.out.println("You are a Gemini!");
			}else {
				System.out.println("You are an Cancer!");
			}
			break;
		case 7: 
			System.out.println("You are a: Cancer or Leo"); //7 = July
			//prompt user for input a specific day
			System.out.println("Enter the day you were born: ");
			//get day from user
			int day7 = userInput.nextInt();
			//if the day is less than or equal to 22 they are the first option, if they are more than they are the second option
			if (day7 <= 22) {
				System.out.println("You are a Cancer!");
			}else {
				System.out.println("You are an Leo!");
			}
			break;
		case 8: 
			System.out.println("You are a: Leo or Virgo"); //8 = August
			//prompt user for input a specific day
			System.out.println("Enter the day you were born: ");
			//get day from user
			int day8 = userInput.nextInt();
			//if the day is less than or equal to 22 they are the first option, if they are more than they are the second option
			if (day8 <= 22) {
				System.out.println("You are a Leo!");
			}else {
				System.out.println("You are an Virgo!");
			}
			break;
		case 9: 
			System.out.println("You are a: Virgo or Libra"); //9 = September
			//prompt user for input a specific day
			System.out.println("Enter the day you were born: ");
			//get day from user
			int day9 = userInput.nextInt();
			//if the day is less than or equal to 22 they are the first option, if they are more than they are the second option
			if (day9 <= 22) {
				System.out.println("You are a Virgo!");
			}else {
				System.out.println("You are an Libra!");
			}
			break;
		case 10: 
			System.out.println("You are a: Libra or Scorpio"); //10 = October
			//prompt user for input a specific day
			System.out.println("Enter the day you were born: ");
			//get day from user
			int day10 = userInput.nextInt();
			//if the day is less than or equal to 22 they are the first option, if they are more than they are the second option
			if (day10 <= 22) {
				System.out.println("You are a Libra!");
			}else {
				System.out.println("You are an Scorpio!");
			}
			break;
		case 11: 
			System.out.println("You are a: Scorpio or Sagittarius"); //11 = November
			//prompt user for input a specific day
			System.out.println("Enter the day you were born: ");
			//get day from user
			int day11 = userInput.nextInt();
			//if the day is less than or equal to 21 they are the first option, if they are more than they are the second option
			if (day11 <= 21) {
				System.out.println("You are a Scorpio!");
			}else {
				System.out.println("You are an Sagittarius!");
			}
			break;
		case 12: 
			System.out.println("You are a: Sagittarius or Capricorn"); //12 = December
			//prompt user for input a specific day
			System.out.println("Enter the day you were born: ");
			//get day from user
			int day12 = userInput.nextInt();
			//if the day is less than or equal to 21 they are the first option, if they are more than they are the second option
			if (day12 <= 21) {
				System.out.println("You are a Sagittarius!");
			}else {
				System.out.println("You are an Capricorn!");
			}
			break;
		default:
			System.out.println("Invalid input!"); //input is too big or too small!
			break;
		}

		//close Scanner userInput
		userInput.close();
	}
}
