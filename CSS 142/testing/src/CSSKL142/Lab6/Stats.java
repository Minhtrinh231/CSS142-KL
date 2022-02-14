package CSSKL142.Lab6;

//necessary imports for file i/o
import java.io.FileInputStream; //"turns" the file into a read stream
import java.util.Scanner; //reads from stream
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream; //"turns" the file into a write stream
import java.io.PrintWriter; //writes to the stream

import java.io.FileNotFoundException; //this exception must be caught and handled when dealing with streams!

/**
 * Write a description of class Stats here.
 * 
 * @author (Minh Trinh)
 * @version (a version number or a date)
 */
public class Stats {
    public static void main(String[] args) throws IOException {
        // Scanner and PrintWrite must be declared outside the try block
        // otherwise their scope will be limited to within the block
        Scanner input = null;

        double inputNumber = 0.0;

        int negNum = 0;
        int btw0and100 = 0;
        int geq100 = 0;

        int lineCounter = 0;
        double grandTotal = 0.0;

        double min = 0.0;
        double max = 0.0;
        double average = 0.0;

        int totalNum = 0;

        try {
            input = new Scanner(
                    new FileInputStream("F:\\Desktop\\CSS 142\\testing\\src\\CSSKL142\\Lab6\\fileIn.txt"));

        } catch (IOException e) {
            System.out.println("File not found.");
            System.exit(0);
        }

        // calculate
        while (input.hasNextDouble()) {
            inputNumber = input.nextDouble();
            grandTotal += inputNumber;

            totalNum++;

            if (inputNumber < min) {
                min = inputNumber;
            } else if (inputNumber > max) {
                max = inputNumber;
            }

            if (inputNumber < 0) {
                negNum++;
            } else if (inputNumber >= 0 && inputNumber < 100) {
                btw0and100++;
            } else if (inputNumber >= 100) {
                geq100++;
            }
        }

        average = grandTotal / totalNum;
        System.out.println(min);
        System.out.println(average);
        System.out.println(max);
        System.out.println(negNum);
        System.out.println(btw0and100);
        System.out.println(geq100);
        System.out.println(totalNum);

        input.close();
        display(average, max, min, lineCounter, negNum, btw0and100, geq100);
    }

    public static void display(double average, double max, double min, double lineCounter, int negNum, int btw0and100,
            int geq100) {

        PrintWriter output = null;
        try {
            output = new PrintWriter(new FileOutputStream(
                    "F:\\Desktop\\CSS 142\\testing\\src\\CSSKL142\\Lab6\\fileOut.txt"));

        } catch (IOException e) {
            System.out.println(" Sorry, we cannot locate the file!");
            System.exit(0);
        }

        output.println("Statistics for the numbers in fileIn.txt:");
        output.printf("average: %f %n", average);
        output.printf("Max: %f %n", max);
        output.printf("Min: %f %n", min);
        output.printf(
                "There are %d negative numbers, %d numbers between 0 (inclusive) and 100 (exclusive), and %d numbers that are greater than or equal to 100.",
                negNum, btw0and100, geq100);
        output.close();
    }
}
