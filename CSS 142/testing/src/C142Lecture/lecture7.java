package C142Lecture;

import java.util.InputMismatchException;
import java.util.Scanner;

public class lecture7 {
    public static void main(String[] args) {

    }

    public static void testExceptions() {
        Scanner key = new Scanner(System.in);
        int number = 0;
        boolean done = false;

        while (!done) {
            try {
                System.out.println("Enter a whole number");
                number = key.nextInt();
                done = true;
            } catch (InputMismatchException e) {
                // TODO: handle exception
                key.nextLine();
                System.out.println("Not a correct written whole number");
                System.out.println("Try again");
            }
        }
        System.out.println("You entered " + number);
    }
}

/**
 * Preview:
 * - Taxi report
 * - Exceptions
 * - Writing to text files
 * - Reading from " "
 * 
 * Execptions: Error, tobe fixed, unexpected
 * 
 * Handling: try/catch, error --> "catch" message
 * - if the try ecounter an error
 * it will bump down to the catch statement
 * 
 * Event handler: a background program looking for something wrong
 * - Exception is a flag that alerts the event handler
 * 
 * Writing to text files: 
 * 
 * 
 */