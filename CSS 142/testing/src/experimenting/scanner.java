package experimenting;

import java.util.Scanner;

public class scanner {

    static Scanner key = new Scanner(System.in);
    
    public static void main(String[] args) {
        intScan();
        doubleScan();
        stringScan();
    }

    public static void intScan() {
        System.out.println("Number of candy in the jar");
        System.out.println("Type in the number of candies and jars");
        int numberCandies = key.nextInt();
        int numbersJars = key.nextInt();
        //key.useDelimiter(",,");

        System.out.println("The numbers of candies are " + numberCandies + " and "+ numbersJars + " jars.");
        System.out.printf("%n");

        //using int for keyboard input
    }

    public static void doubleScan() {
        System.out.println("what numbers can be add to (a + b) / c?");

        double variableA = key.nextDouble();
        double variableB = key.nextDouble();
        double variableC = key.nextDouble();
        double total = (variableA + variableB) / variableC;

        System.out.printf("The answer is %.2f ", total);
        System.out.printf("%n");

        //using doubles for keyboard input
    }

    public static void stringScan() {
        System.out.println("Type in a randon word");

        String randomWord = key.nextLine();

        System.out.println("The random word is: " + randomWord);

        //using string for input
    }

    
}
