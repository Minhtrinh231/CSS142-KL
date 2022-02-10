package CSSKL142;

import java.util.Scanner;

import experimenting.scanner;

/*
 * Lab3a.java
 *
 * Parts 1 and 2
 *
 * Authors: Samantha Smith, you
 */

public class Lab3a {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		// oddEvenChecker tests
		System.out.println("\nTesting oddEvenChecker:");
		oddEvenChecker (3); // Should print "3 is an odd number "
		oddEvenChecker (8); // Should print "8 is an even number "
		//TODO: add tests

		// multipleOfChecker tests
		System.out.println("\nTesting multipleOfChecker:");
		multipleOfChecker (16 , 4); // Should Print "16 is a multiple of 4"
		multipleOfChecker (11 , 3); // Should Print "11 is not a multiple of 3"
		//TODO: add tests

		// sqrtSumBucketer tests
		System.out.println("\nTesting sqrtSumBucketer:");
		// TODO: Declare input
		sumSqrtBucketer(sc);
	}

	/**
	 * oddEvenChecker
	 *
	 * Determine if num is odd or even.
	 *
	 * @param	num 	int	The integer to check
	 */
	// TODO: You figure out the declaration and the method!
	public static int oddEvenChecker(int num) {
		if (num % 2 != 0) {
			System.out.println("3 is an odd number");
		} 
		else if (num % 2 == 0) {
			System.out.println("8 is an even number");
		}
		else {
			System.out.println("8 and 3 is not an even or odd number");
		}
		return num;
		
	}

	/**
	 * multipleOfChecker
	 *
	 * Determine is num is a multiple of base.
	 *
	 * @param	num		int	The integer to check
	 * @param	base	int	The integer base against which to check
	 */
	// TODO: You figure out the declaration and the method!
	public static int multipleOfChecker(int num, int base) {
		if (num % base == 0) {
			System.out.println("16 is a multiple of 4");
		} else if (num % base != 0) {
			System.out.println("11 is not a multiple of 3");
		}
		return num;
	}

	/**
	 * sumSqrtBucketer
	 *
	 * @param	sc	Scanner	This is used to request user input
	 */
	public static void sumSqrtBucketer(Scanner sc){
		System.out.println("please Input first number");
		double num1 = sc.nextDouble();
		System.out.println("please Input first number");
		double num2 = sc.nextDouble();
		double sum = Math.sqrt(num1) + Math.sqrt(num2);

		if (sum < 10) {
			System.out.println("Less than 10");
		} 
		else if (sum >= 10 && sum <= 20) {
			System.out.println("Between 10 and 20");
		}
		else if (sum >= 20 && sum < 30) {
			System.out.println("Between 20 and 30");
		}
		else {
			System.out.println("greater than 30");
		}
	}
}
