package HW;

import java.util.Scanner;

public class HW_Branching {
    static Scanner keyInput = new Scanner(System.in);
    public static void main(String[] args) {
        /*The following is asking user
        for the three store and the threshold*/ 
        System.out.println("Enter the sales for Store 1");
        double S1 = keyInput.nextDouble();
        System.out.println("Enter the sales for Store 2");
        double S2 = keyInput.nextDouble();
        System.out.println("Enter the sales for Store 3");
        double S3 = keyInput.nextDouble();
        System.out.println("Enter the sales threshold");
        double Threshold = keyInput.nextDouble();

        //Calculating the threshold average
        double ThresAvg1_2 = (S1 + S2) / 2;
        double ThresAvg1_3 = (S1 + S3) / 2;
        double ThresAvg2_1 = (S2 + S1) / 2;
        double ThresAvg2_3 = (S2 + S3) / 2;
        double ThresAvg3_1 = (S2 + S1) / 2;
        double ThresAvg3_2 = (S2 + S1) / 2;
        double totalAvg = (S1 + S2 + S3) / 3;

        /*If all of the above does not applied 
        then this line will run*/
        if (S1 > Threshold && S2 > Threshold && S3 > Threshold) {
            System.out.println("All 3 stores did great!");
            System.out.printf("The average sales for exceeding stores: %.2f", totalAvg);
        }
         /*checking if store 1 exceed the threshold
        and checking if store 1 and another exceeded 
        the threshold*/
        else if (S1 > S2 && S1 > S3 && S1 >= Threshold) {
            System.out.println("Store 1 did great");
            System.out.printf("The average sales for exceeding stores: %.2f", S1);
        }
        else if (S1 >= Threshold && S2 >= Threshold && S3 != Threshold) {
            System.out.println("Store 1 and Store 2 did great!");
            System.out.printf("The average sales for exceeding stores: %.2f", ThresAvg1_2);
        }
        else if (S1 >= Threshold && S3 >= Threshold && S2 != Threshold) {
            System.out.println("Store 1 and Store 3 did great!"); 
            System.out.printf("The average sales for exceeding stores: %.2f", ThresAvg1_3);  
        } 
        /*checking if store 2 exceed the threshold
        and checking if store 2 and another exceeded 
        the threshold*/
        else if (S2 > S1 && S2 > S3 && S2 >= Threshold) {
            System.out.println("Store 2 did great");
            System.out.printf("The average sales for exceeding stores: %.2f", S2);
        }
        else if (S2 >= Threshold && S1 >= Threshold && S3 != Threshold) {
            System.out.println("Store 2 and Store 1 did great!");
            System.out.printf("The average sales for exceeding stores: %.2f", ThresAvg2_1);
        }
        else if (S2 >= Threshold && S3 >= Threshold && S1 != Threshold) {
            System.out.println("Store 2 and Store 3 did great!");
            System.out.printf("The average sales for exceeding stores: %.2f", ThresAvg2_3);
        }
        /*checking if store 3 exceed the threshold
        and checking if store 3 and another exceeded 
        the threshold*/
        else if (S3 > S1 && S3 > S2 && S3 >= Threshold) {
            System.out.println("Store 3 did great");
            System.out.printf("The average sales for exceeding stores: %.2f", S3);
        }   
        else if (S3 >= Threshold && S1 >= Threshold && S2 != Threshold) {
            System.out.println("Store 3 and Store 1 did great!");
            System.out.printf("The average sales for exceeding stores: %.2f", ThresAvg3_1);
        }
        else if (S3 >= Threshold && S2 >= Threshold && S1 != Threshold){
            System.out.println("Store 3 and Store 2 did great!");
            System.out.printf("The average sales for exceeding stores: %.2f", ThresAvg3_2);
        }
        /*checking if all three stores exceeded the threshold*/
        else if (S1 > Threshold && S2 > Threshold && S3 > Threshold) {
            System.out.println("All 3 stores did great!");
            System.out.printf("The average sales for exceeding stores: %.2f", totalAvg);
        }
        /*If all of the above does not applied 
        then this line will run*/
        else {
            System.out.println("No store met the threshold");
        }
    }   
}
