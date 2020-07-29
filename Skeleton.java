// Solutions 

import java.util.*;

public class Skeleton
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
		 * Count the number of mistakes you notice, and fix them
		 * Submit the number to the slido poll (i.e. the number of lines with a mistake)
		 * Use an array and for loop to count through and output them etc
		 */
		
		String[] fruits = {"apple", "banana", "pear", "strawberry", "raspberry", "pomegranate", "orange"};
		for (int i = 0; i < fruits.length; i++) {
			System.out.println("Fruit " + (i+1) + " = " + fruits[i]);
		}
	}
	
	public static void exercise2() {
		/*
		 * Prompt the user to enter three integers
		 * Output the largest of the three values
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		int inputOne = scanner.nextInt();
		System.out.println("Enter second number:");
		int inputTwo = scanner.nextInt();
		System.out.println("Enter third number:");
		int inputThree = scanner.nextInt();
		
		if (inputOne >= inputTwo && inputOne >= inputThree) {
			System.out.println("Biggest number is: " + inputOne);
		}
		else if (inputTwo >= inputOne && inputTwo >= inputThree) {
			System.out.println("Biggest number is: " + inputTwo);
		}
		else {
			System.out.println("Biggest number is: " + inputThree);
		}
		
	}
	
	public static void exercise3() {
		/*
		 * Prompt the user to enter an integer. Check whether the integer is odd or even.
		 * If EVEN: Output "Value is even" where 'value' is replaced by the integer which has been entered 
		 * If ODD: Output "Value is odd" where 'value' is replaced by the integer which has been entered
		 */
		
		System.out.println("Please enter an integer");
		
		Scanner userInput = new Scanner(System.in);
		int integerInput = userInput.nextInt();
		System.out.println("The number you have entered is: " + integerInput);
		
		if (integerInput % 2 == 0) {
			System.out.println("Number is even");
		}
		else if (integerInput % 2 == 1) {
			System.out.println("Number is odd");
		}
		else {
			System.out.println("Invalid value entered");
		}
	}
	
	public static void exercise4() {
		/*
		 * Create a method which takes a string from the user and outputs the reverse of the string
		 */
		
		Scanner inputString = new Scanner(System.in);
		System.out.println("Please enter a word");
		String str = inputString.next();
		String result = "";
		for (int z = 0; z < str.length(); z++) {
		    result += str.charAt(str.length() - z - 1);
		}
		System.out.println("Reversed string: " + result);
		inputString.close();
	}
}
