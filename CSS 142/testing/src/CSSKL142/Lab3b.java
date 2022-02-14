package CSSKL142;

/*
 * Lab3b.java
 *
 * Parts 3 and 4
 *
 * Author: Samantha Smith, you
 */

public class Lab3b {
	public static void main(String[] args) {
		part3();

		// smallestOfThree tests
		System.out.println("\nTesting greaterOfTwo:");
		greaterOfTwo(-3, 6.2);
		//TODO: add tests

		// smallestOfThree tests
		System.out.println("\nTesting smallestOfThree:");
		smallestOfThree(3, 17, 8);      
		//TODO: add tests
	}

	/**
	 * part3
	 *
	 * Sanity check for handwritten work
	 */
	public static void part3() {
		boolean isFiveLess = 5 < 15;
		int n = 4;
		boolean isEven = ( n % 2 == 0 );
		boolean isOdd = ! ( isEven );
		boolean isTenLessOrEqual = ( 10 <= 100/10 );
		int a = 3;
		int b = 5;
		boolean isALess = a < b;

		// TODO: add print statements
		System.out.println(isFiveLess);
		System.out.println(isEven);
		System.out.println(isOdd);
		System.out.println(isTenLessOrEqual);
		System.out.println(isALess);
	}

	/**
	 * greaterOfTwo
	 *
	 * Return the gereater of the two values without using Math.max or Math.min
	 *
	 * @param	num1	double
	 * @param	num2	double
	 * @return	TODO
	 */
	// TODO: You figure out the declaration and the method!
	public static double greaterOfTwo(double num1, double num2) {
		if (num1 > num2) {
			System.out.printf("%.2f is larger than %.2f", num1, num2);
		} else {
			System.out.printf("%.2f is larger than %.2f", num2, num1);
		}

		return num1 + num2;
	}

	/**
	 * smallestOfThree
	 *
	 * Return the smallest of the three values without using Math.max or Math.min
	 * System.out.printf("%.2f is the smallest", num1);
	 * @param	num1	double
	 * @param	num2	double
	 * @param	num3	double
	 * @return	TODO
	 */
	// TODO: You figure out the declaration and the method!
	public static double smallestOfThree(double num1, double num2, double num3) {
		if (num1 < num2 && num1 < num3) {
			System.out.printf("%.2f is the smallest", num1);
		}
		else {
			if (num2 < num1 && num2 < num3) {
				System.out.printf("%.2f is the smallest", num2);
			}
			else {
				if (num3 < num1 && num3 < num2) {
					System.out.printf("%.2f is the smallest", num3);
				}
			}
		}
	
		return num1 + num2 + num3;
	}
}
