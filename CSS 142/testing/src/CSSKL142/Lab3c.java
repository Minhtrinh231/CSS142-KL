package CSSKL142;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import experimenting.scanner;

/*
 * Lab3c.java
 *
 * Parts 5
 *
 * Author: Samantha Smith, you
 */

public class Lab3c {
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO: Get user choice
		System.out.println("Hi, you'll be playing a game of rock, paper, and scissors againts the computer");
		System.out.println("Please input a number 0 = rock, 1 = paper, 2 = scissors");
		int userInput = keyboard.nextInt();
		// TODO: Generate random computer choice
		int compChoice = ThreadLocalRandom.current().nextInt(0, 2);
		System.out.println("The computer choses " + compChoice);
		// TODO: Print choices
		intToWord(userInput, compChoice);
		// TODO: Determine winner
		findWinner(userInput, compChoice);
		outputChoice(userInput, compChoice);
	}

	/**
	 * intToWord
	 *
	 * Convert from an integer to the relevant string, using a switch
	 *
	 * @param choice int The choice to convert
	 * @return
	 * @return TODO
	 */
	// TODO: You figure out the declaration and the method!
	public static int intToWord(int userInput, int compChoice) {
		int check = userInput;
		int checkComp = compChoice;

		switch (check) {
			case 0:
				System.out.println("You have chosen rock");
				break;
			case 1:
				System.out.println("You have chosen paper");
				break;
			case 2:
				System.out.println("You have chosen scissors");
				break;
			default:
				System.out.println("Invalid input");
				break;
		}

		switch (checkComp) {
			case 0:
				System.out.println("Computer has chosen rock");
				break;
			case 1:
				System.out.println("Computer has chosen paper");
				break;
			case 2:
				System.out.println("Computer has chosen scissors");
				break;
			default:
				System.out.println("Invalid input");
				break;
		}

		return check + checkComp;
	}

	/**
	 * score
	 *
	 * Determine the winner from two choices
	 *
	 * @param userchoice int The user's choice
	 * @param compchoice int The computer's choice
	 * @return TODO
	 */
	// TODO: You figure out the declaration and the method!
	public static int findWinner(int userInput, int compChoice) {
		if (userInput == 0 && compChoice == 0) {
			System.out.println("Tie");
		} else {
			if (userInput == 0 && compChoice == 1) {
				System.out.println("Computer beats You. Computer win.");
			} else {
				if (userInput == 0 && compChoice == 2) {
					System.out.println("You beats Computer. You win.");
				} else {
					if (userInput == 1 && compChoice == 1) {
						System.out.println("Tie");
					} else {
						if (userInput == 1 && compChoice == 2) {
							System.out.println("Computer beats You. Computer win.");
						} else {
							if (userInput == 1 && compChoice == 0) {
								System.out.println("You beats Computer. You win.");
							} else {
								if (userInput == 2 && compChoice == 2) {
									System.out.println("Tie");
								} else {
									if (userInput == 2 && compChoice == 0) {
										System.out.println("Computer beats You. Computer win.");
									} else {
										if (userInput == 2 && compChoice == 1) {
											System.out.println("You beats Computer. You win.");
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return userInput + compChoice;
	}

	/**
	 * chooseString
	 *
	 * "<person> chose <string value of choice>."
	 * 
	 * @param person String Either "You" or "I"
	 * @param choice int The person's choice
	 * @return TODO
	 */
	// TODO: You figure out the declaration and the method!
	public static void outputChoice(int userInput, int compChoice) {

	}

}
