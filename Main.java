/*
 * Below are four exercises which perform different tasks. Each one is missing lines of code, indicated by _____________ . 
 * 
 * Follow the instructions as given in the slides
 * Full solutions to these tasks will be uploaded to the github repository after the session
 */

import java.util.*;

public class Main
{

	public static void main(String[] args)
	{
		exercise1();
		exercise2();
		exercise3();
		exercise4();
	}
	public static void exercise1() {
		/*
		 * This program has an array of fruits, which must be outputted individually to the console in the format: "Fruit 1 : apple"
		 */
		
		String[] fruits = {"apple", "banana", "pear", "strawberry", "raspberry", "pomegranate", "orange"};
		for (int i = ____; i __ fruits.length; ____) {
			System.out.println("Fruit " + (i+1) + " = " + fruits[__]);
		}
	}
	
	public static void exercise2() {
		/*
		 * Prompt the user to enter three integers
		 * Output the largest of the three values
		 */
	
		Scanner scanner = new ________________
				
		System.out.println("Enter first number:");
		int inputOne = scanner.nextInt();
		System.out.println("Enter second number:");
		int inputTwo = scanner.nextInt();
		System.out.println("Enter third number:");
		int inputThree = scanner.nextInt();
		//Create a series of if/ else statements to output the biggest number: (the first one has been done for you)
		if (inputOne >= inputTwo && inputOne >= inputThree) {
			System.out.println("Biggest number is: " + inputOne);
		}
		else if (__________________________________) {
			____________________________________________________
		}
		else {
			____________________________________________________
		}
	}
	
	public static void exercise3() {
		/*
		 * Prompt the user to enter an integer. Check whether the integer is odd or even.
		 * If EVEN: Output "Value is even" where 'value' is replaced by the integer which has been entered 
		 * If ODD: Output "Value is odd" where 'value' is replaced by the integer which has been entered
		 */
		
		System.out.println("Please enter an integer");
		
		Scanner userInput = new ______________
		int integerInput = userInput.___________
		System.out.println("The number you have entered is: " + ______________);
		
		if (integerInput % 2 == 0) {
			________________________
		}
		else if (integerInput % 2 == 1) {
			________________________
		}
		else {
			System.out.println("Invalid value entered");
		}
	}
	
	public static void exercise4() {
		/*
		 * Create a method which takes a string from the user and outputs the reverse of the string
		 */
		
		________ inputString = new Scanner(System.in);
		System.out.println("Please enter a word");
		______ str = inputString.next();
		______ result = "";
		for (_________; z < str.length(); ___) {
		    result += str.charAt(str.length() - z - 1);
		}
		//Insert line below to output the final result in the format: "Reversed string ________"
		____________________________
		____________.close();
	}
}
