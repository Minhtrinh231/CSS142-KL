package HW;

import java.util.Scanner;

public class QuanHW_Branching {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the sales for Store 1:");
            double store1Input = keyboard.nextDouble();
            System.out.println("Enter the sales for Store 2:");
            double store2Input = keyboard.nextDouble();
            System.out.println("Enter the sales for Store 3:");
            double store3Input = keyboard.nextDouble();
            System.out.println("Enter the sales threshold:");
            double thresholdInput = keyboard.nextDouble();
            ///////////////////////////////////////////////////////////////////////
            double thresholdavergeForThreeNumber = (store1Input + store2Input + store3Input)/3;
            double thresholdavergeForTwoNumber = (max(store1Input,store2Input,store3Input) +  mid(store1Input,store2Input,store3Input))/2;
            /////////////////////////////////////////////////////////////////////
            //

            if ((thresholdInput <= store1Input) && (thresholdInput <= store2Input) && (thresholdInput <= store3Input)) {
                System.out.println("All 3 store did good");
                System.out.println("The averge sale for exceeding stores:" + thresholdavergeForThreeNumber);

            } else if ((thresholdInput <= store1Input) && (thresholdInput > store2Input) && (thresholdInput > store3Input)) {
                System.out.println("Store 1 did good");
                System.out.println("The averge sale for exceeding stores:  " + thresholdavergeForTwoNumber);

            } else if ((thresholdInput <= store1Input) && (thresholdInput <= store2Input)) {
                System.out.println("Store 1 and 2 did good");
                System.out.println("The averge sale for exceeding stores:" + thresholdavergeForTwoNumber);

            } else if ((thresholdInput <= store1Input) && (thresholdInput <= store3Input)) {
                System.out.println("Store 1 and 3 did good");
                System.out.println("The averge sale for exceeding stores:" + thresholdavergeForTwoNumber);

            } else if (thresholdInput <= store2Input && (thresholdInput > store1Input) && (thresholdInput > store3Input)) {
                System.out.println("Store 2 did good");
                System.out.println("The averge sale for exceeding stores:" + thresholdavergeForTwoNumber);

            } else if ((thresholdInput <= store2Input) && (thresholdInput <= store3Input)) {
                System.out.println("Store 2 and 3 did good");
                System.out.println("The averge sale for exceeding stores:" + thresholdavergeForThreeNumber);

            } else if (thresholdInput <= store3Input && (thresholdInput > store1Input) && (thresholdInput > store2Input)) {
                System.out.println("Store 3 did good");
                System.out.println("The averge sale for exceeding stores:" + thresholdavergeForTwoNumber);

            } else {
                System.out.println("None of the store did good");
            }
        }
    }
    public static double max(double store1Input, double store2Input, double store3Input){
        if (store1Input > store2Input && store1Input > store3Input){
            return store1Input;
        }else if(store2Input > store1Input && store2Input > store3Input){
            return store2Input;
        }else{
           return store3Input;
        }
    }
    public static double mid(double store1Input, double store2Input, double store3Input){
        double mid1 = Math.max(Math.min(store1Input,store2Input), Math.min(store2Input,store3Input));
        double mid2 = Math.max(Math.min(store1Input,store3Input), Math.min(store2Input,store3Input));
        double mid = Math.max(mid1,mid2);
        return mid;
    }
}


