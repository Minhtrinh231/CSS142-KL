package CSSKL142;

import java.util.Scanner;
import java.util.*;

/**
 * Description of this class here
 */


public class Lab5 {

    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args)  {
        boolean checkIn = true;
        System.out.println("Enter 1 to check how long it takes to get rich on a magic dollar coin.");
        System.out.println("Enter 2 to calculate e^x for any real x.");
        System.out.println("Enter 3 to enter palindrome words.");
        System.out.println("Enter 4 to re-print the menu.");
        System.out.println("Enter 0 to exit.");

        while (checkIn) {
            System.out.println("What is your choice?");
            int menuIn = keyboard.nextInt();
            if (menuIn == 1) {
            getRichQuick();
            System.out.println();            		// Should run your method
            }
            else if (menuIn == 2) {
                System.out.println("Enter an x: ");
                double eInput = keyboard.nextDouble();
                double taylorResult = eTaylor(eInput);    // Will call your method with a parameter. Now display the return value from your method     
                System.out.println();
            }
            else if (menuIn == 3) {
                palindromeCheck();   					// test your method
            }
            else if (menuIn == 4) {
                System.out.println("Enter 1 to check how long it takes to get rich on a magic dollar coin.");
                System.out.println("Enter 2 to calculate e^x for any real x.");
                System.out.println("Enter 3 to enter palindrome words.");
                System.out.println("Enter 4 to re-print the menu.");
                System.out.println("Enter 0 to exit.");
                System.out.println();
            } else if (menuIn == 0) {
                checkIn = false;
                System.out.println("Thanks for participating! Goodbye.");
            }
        }
    }
    
    // Part 1
    public static void getRichQuick() {
        // Declare your variables here and implement your logic
        double coin = 1.00;
        int day = 1;
        double total = 0;

        while (total <= 1000000) {
            total = coin + (1 + (coin / 2));
            System.out.printf("Day %d: $%.2f + ($1 + %.2f) = %.2f %n", day, coin, (coin/2), total);
            coin = total;
            day++;
        }
    }
    
    // Part 2 
    public static double eTaylor( double x ) {
        double taylorNumber = 0;
        double answer = 0;
        // Your logic goes here
        for(double i = 0; i <= 31 ; i++ ){
            answer = answer + taylorNumber;
            taylorNumber = eTaylorHelper(x,(int) i);
        }
        System.out.println("e^" + x + " = " + answer);
        
        return taylorNumber;
    }
    
    public static double eTaylorHelper(double x, int z){
        double power = 1;
        double factorial = 1;
        
        for(int i = 1; i <= z; i++){
            power = power * x;
            factorial = factorial * i;
        }
        return power / factorial;
    }
    //Thanks for Quan nguyen for collaborating with me on Part 2.
      
      
      
    // Part 3
    /**
     * This program reads words, identifies, counts and writes all the palindromes and the total
     * palindrome count.
     * 
     * // hint 1: Using keybord.next() will only return what comes before a space.
       // hint 2: Using keybord.nextLine() automatically reads the entire current line.
     */
    public static void palindromeCheck() {

        boolean endProgram = true;
        String someWord = ""; // Stores words read from user input
        int count = 0;        // keeps track of Palindrome words only (define algorithm to count # of palindrome words
        int total = 0;        // Counts the total number of lines read from the given text file
 
        System.out.println("\nEnter some words separated by white space\n");    // Ask for user input
 
        // declare your Scanner object here
        Scanner keyboard = new Scanner(System.in);
 
        // for each word user enters
        while (endProgram) {
            someWord = keyboard.next();          // store each word in a string variable and then do your operations
            total++;                             // increment number of words as youread each one
            int n = 1;
            boolean check = true;

            // #1. Code your logic for how to determine if a word is Palindrome first, then complete # 2
            for(int i = 0; i < someWord.length(); i++){
                if(someWord.charAt(i) == someWord.charAt(someWord.length() - n)){
                    check = true;

                }else{
                    check = false;
                }
                n++;
            }
            if(check == true){
                count++;
            }
            System.out.println("  " + total + " " + someWord);
            System.out.println("There are " + count + " palindromes out of " + total + " words provided by user");
            System.out.println("You have to input 0 to turn it off or enter 1 to do it again");
            Scanner keyboard1 = new Scanner(System.in);
            int end1 = keyboard1.nextInt();
            if(end1 == 0){
                endProgram = false;
            }
            System.out.println("\nEnter some words separated by white space\n");
        }
    }
}
//Thanks to Quan and David for working on part 3 with me







 

