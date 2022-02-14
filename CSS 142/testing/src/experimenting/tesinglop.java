package experimenting;

import java.io.FileInputStream;
import java.util.Scanner;

public class tesinglop {
    public static void main(String[] args) {
        Scanner in = null;

        //Checking if the in scnner could find the courseData.txt file
        try {
            in = new Scanner(new FileInputStream("F:\\Desktop\\CSS 142\\testing\\src\\HW\\courseData.txt"));
        } catch (Exception e) {
            System.out.println("File not found.");
            System.exit(0);
        }

        double proWeight = in.nextDouble();
        double midWeight = in.nextDouble();
        double finalWeight = in.nextDouble();

        while (in.hasNextInt()) {
            int class1 = in.nextInt();
            boolean checking = true;
            double classAvg = 0;
            double student = 0;
            double totalClassAvg = 0;
            double weightAvg = 0;

            System.out.println("Grade Data For Class " + class1);
            System.out.println();
            System.out.println(" ID  Program  Midterm  Final  Weighted Avearage  Program grade");
            System.out.println(" --  -------  -------  -----  -----------------  -------------");

            while (checking) {
                int ID = in.nextInt();

                if (ID == 0) {
                    checking = false;
                }
                if (checking) {
                    String grade = "";
                    int program = in.nextInt();
                    int midterms = in.nextInt();
                    int final1 = in.nextInt();
                    student += 1;

                    //testVariable(final1);

                    weightAvg = (program*proWeight) + (midterms*midWeight) + (final1*finalWeight);
                    totalClassAvg += weightAvg;
                    classAvg = totalClassAvg / student;

                    if (program >= 70 ) {
                        grade = "Pass";
                    }
                    else if (program < 70) {
                        grade = "Fail";
                    }
                    System.out.printf("%d    %d      %d       %d        %.2f             %s %n", ID, program, midterms, final1, weightAvg, grade);
                }
            }
            System.out.printf("Class Average: %.2f %n", classAvg);
            System.out.println();
        }   
    }

    public static void testVariable(int x) {
        System.out.println(x);
    }
}
