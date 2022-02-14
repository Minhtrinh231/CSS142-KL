package HW;
/**
 * Author: Minh Trinh
 * Description: The purpose of this program is to take the
 * inputs of the file, courseData.txt, and reads the data
 * and outputs to the console. The text files contains the 
 * grades of the program, midterms, and finals. The program
 * will use the data and calculate the weighted grade of 
 * each students and comapre if they passes or fails. The 
 * Program will take the total ammount of students and divided
 * by the total wighted grades. Then the program will repeats.
 * 
 * Thanks to David Kim and Quan Nguyen for helping me with
 * this assignment.
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class HW_Loops_Files {
    public static void main(String[] args) {
        //Decalring in as a Scanner, which equals to null.
        Scanner in = null;

        /**
         * Checking if the in scanner could find the courseData.txt file
         * and if not then the catch will throw 
         * an execption and will print out the file not and end the program.
         */
        try {
            in = new Scanner(new FileInputStream("F:\\Desktop\\CSS 142\\testing\\src\\HW\\courseData.txt"));
        } catch (Exception e) {
            System.out.println("File not found.");
            System.exit(0);
        }

        //Assigning variables to type double from the text file
        double proWeight = in.nextDouble();
        double midWeight = in.nextDouble();
        double finalWeight = in.nextDouble();

        /**
         * First while loop of the nested while loops 
         * assigns different types of variables and 
         * printing the class data summary and the columns.
         */
        while (in.hasNextInt()) {
            int class1 = in.nextInt();
            boolean checking = true;
            double classAvg = 0;
            double student = 0;
            double totalClassAvg = 0;
            double weightAvg = 0;

            //Prints out the colums and class name
            System.out.println("Grade Data For Class " + class1);
            System.out.println();
            System.out.println(" ID  Program  Midterm  Final  Weighted Avearage  Program grade");
            System.out.println(" --  -------  -------  -----  -----------------  -------------");

            /**
             * The second while loop prints the grades and ID's for each colums
             * and it checks for if the ID ecountered 0 it will restart the loop.
             * It will also calculate the class average and check if the student passes
             * or failed. 
             */
            while (checking) {
                int ID = in.nextInt();

                //Check if there is a zero in ID
                //If so then checking will be false.
                if (ID == 0) {
                    checking = false;
                }
                //If checking is true then this if statement will printout the 
                //grading for the colums, grade passing, and
                //calculating the class average.
                if (checking) {
                    String grade = "";
                    int program = in.nextInt();
                    int midterms = in.nextInt();
                    int final1 = in.nextInt();
                    student += 1;

                    //testVariable(final1);
                    //testVariableMidterms(midterms);

                    //calculating class average
                    weightAvg = (program*proWeight) + (midterms*midWeight) + (final1*finalWeight);
                    totalClassAvg += weightAvg;
                    classAvg = totalClassAvg / student;

                    //checking if the student pass or fails.
                    if (program >= 70 ) {
                        grade = "Pass";
                    }
                    else if (program < 70) {
                        grade = "Fail";
                    }

                    //This prints the grades for the colums.
                    System.out.printf("%d    %d      %d       %d        %.2f             %s %n", ID, program, midterms, final1, weightAvg, grade);
                }
            }
            //Print out the class average under the grade colums.
            System.out.printf("Class Average: %.2f %n", classAvg);
            System.out.println();
        }   
    }
    /**This two method is to check the final and the midterms score.*/
    public static void testVariablefinal(int x) {
        System.out.println(x);
    }
    public static void testVariableMidterms(int x) {
        System.out.println(x);
    }
}
