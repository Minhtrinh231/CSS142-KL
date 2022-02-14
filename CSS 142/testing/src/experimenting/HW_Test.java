package experimenting;

import java.util.Scanner;

public class HW_Test {
    static Scanner keyInput = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the sales for Store 1");
        double S1 = keyInput.nextDouble();
        System.out.println("Enter the sales for Store 2");
        double S2 = keyInput.nextDouble();
        System.out.println("Enter the sales for Store 3");
        double S3 = keyInput.nextDouble();
        System.out.println("Enter the sales threshold");
        double salesIn = keyInput.nextDouble();

        double ThresAvg = (S1 + S2 + S3) / 3;

        if (S1 > S2 && S1 > S3 && S1 >= salesIn) {
            System.out.println("Store 1 did great");
            if (S1 >= salesIn && S2 >= salesIn && S3 != salesIn) {
                System.out.println("Store 1 and Store 2 did great");
            }
            else {
                System.out.println("Store 1 and Store 3 did great");
            }
        } 
        else if (S2 > S1 && S2 > S3 && S2 >= salesIn) {
            System.out.println("Store 2 did great");
            if (S2 >= salesIn && S1 >= salesIn && S3 != salesIn) {
                System.out.println("Store 2 and Store 1 did great");
            }
            else {
                System.out.println("Store 2 and Store 3 did great");
            }
        }
        else if (S3 > S1 && S3 > S2 && S3 >= salesIn) {
            System.out.println("Store 3 did great");
            if (S3 >= salesIn && S1 >= salesIn && S2 != salesIn) {
                System.out.println("Store 3 and Store 1 did great");
            }
            else {
                System.out.println("Store 3 and Store 2 did great");
            }
        }
        else {
            System.out.println("No store met the threshold");
        }
    }    
    
}
