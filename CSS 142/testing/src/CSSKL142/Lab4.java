package CSSKL142;


/**
 * Write a description of class Lab4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.lang.*;

public class Lab4 {

    /**
     * main method (driver) to execute all the method calls properly
     *
     * @param args
     */
    public static void main(String[] args) {

        // Call all methods here
        countGrains();
        powerOfTwo(73);
        powerOfTwo(64);
        numBackward(1234321);
        numBackward(1234567);
        straightLine();
        boxMaker();

    }


    /**
     * Calculates the number of grains and prints out the result per lab instructions
     */
    public static void countGrains() {

        // declare and initialize your variables first, if any
        int grains = 1;
        int total = 1;

        for (int i = 1; i <= 64; i++) {
         System.out.printf("Day %d and you got %d grain(s) of rice for a total of %d grain(s). %n", i, grains, total);
         grains = i + i;
         total = total + grains;
        }

        System.out.println();
    }

    /**
     * Determines if a number is power of 2 and displays result per lab instructions
     * @param numberInput
     */
    public static void powerOfTwo (int numberInput) {

        // declare and initialize your variables first, if any then start writing your code
        int countPower = 1;
        int compare = 2;
        int k = 1;
        // use what we learned in branching exercise if/else statements
        if (numberInput % 2 == 1) {
           System.out.println(numberInput + " is not a power of 2");
        } else {
           while (!(compare >= numberInput)) {
              compare *= 2;
              countPower += 1;
              if (numberInput == compare) {
                 System.out.println(numberInput + " is 2 to the power of " + countPower);
                 k = 0;
              }
           }
           if (k == 1) {
            System.out.println(numberInput + " is not a power of 2");
           }
        }
        System.out.println(); 
        //Much thanks to David Kim for helping me.
    }

   

    /**
     * Reverses the digits of a given integer, i.e. 12345 would become 54321 per lab instructions
     *
     * @param number
     */ //1234321
    public static void numBackward(int number) {

       // declare and initialize your variables first, if any then start writing your code
       //String str = Integer.toString(number);
       //System.out.println(str);
       int check = 0;
       int remainder; 

       for (int i = number; i != 0; i /= 10) {
          remainder = i % 10;
          check = check * 10 + remainder;
       }

       if(number == check){
         System.out.println("backward Number: " + number + " palidrome");
       } else{
         System.out.println("backward Number: " + number + " is not palidrome");
       }
       System.out.println(); 
    }

    /**
     * Produces and displays a straight line using asterisks per lab instructions
     */

    public static void straightLine() {

       // declare and initialize your variables first, if any then start writing your code

       for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
             System.out.print("*");
          }
          System.out.println();
       }


    }

    /**
     * void method that asks the user for an integer x (using Scanner), and prints box using asterisks
     * refer to detailed instructions in lab description part 6
     */

    public static void boxMaker() {

       // declare and initialize your variables first, if any then start writing your code
       Scanner key = new Scanner(System.in);
       System.out.print("Input Number: ");
       int userIn = key.nextInt();

       for (int i = 0; i < userIn; i++) {
          for (int j = 0; j < userIn; j++) {
             if (i == 0 || j == 0 || i == userIn - 1 || j == userIn - 1) {
                System.out.print("*");
             } else {
                System.out.print(" ");
             }
          }
          System.out.println();
       }


    }

    /**
     *  void mathod to print a shape that is a triangular pattern with sides of 6 asterisks
     *  refer to detailed instructions in lab description part 7a
     */

    public static void shape7a(int number) {

       // declare and initialize your variables first, if any then start writing your code



    }


    /**
     * void method to print a shape that is an "X" pattern with arms of 3 asterisks each.
     * refer to detailed instructions in lab description part 7b
     */

    public static void shape7b(int number) {

       // declare and initialize your variables first, if any then start writing your code



    }

} // end class Lab4



    
  

