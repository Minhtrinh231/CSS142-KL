package CSSKL142;

/*
 * Lab2b.java
 *
 * Authors: Samantha Smith, you
 */

// TODO: Do you need any imports?
import java.util.Scanner;

public class Lab2b {
	public static void main(String[] args){
		// TODO: Declare a Scanner
		Scanner keyinput = new Scanner(System.in);

		// TODO: Request and parse user input
		System.out.println("Please enter you name followed by three numbers (space separated): ");
		String intString = keyinput.next();
		double Numb1 = keyinput.nextDouble(); //2
		double Numb2 = keyinput.nextDouble(); //4
		double Numb3 = keyinput.nextDouble(); //6
		
		// TODO: Sort values and display

		//The largest number
		double max1 = Math.max(Numb1, Numb2); 
		double max1Final = Math.max(max1, Numb3);

        //The middle number
		double max2 = Math.max(Math.min(Numb1, Numb2), Math.min(Numb2, Numb3));
		double max2f1 = Math.max(Math.min(Numb1, Numb3), Math.min(Numb2, Numb3));
		double max2Final = Math.max(max2f1, max2);

		//The last number
		double max3 = Math.min(Numb1, Numb2);
		double max3Final = Math.min(max3, Numb3);
		System.out.printf("Hi there, %s Here are the numbers you entered in descending order: %n", intString);
		System.out.printf("%.2f, %.2f and %.2f %n", max1Final, max2Final, max3Final);

		// TODO: Thank user
		System.out.println("Thank you for using the three-number-sorting system! Good-bye.");

		//This part was help by two of my peers, Thanks to Quan Nguyen and David Kim
	}
	
	// Declare a sortDescending method that will take three doubles (optional)
}
