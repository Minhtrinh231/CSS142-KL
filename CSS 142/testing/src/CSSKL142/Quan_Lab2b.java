package CSSKL142;
    import java.util.Scanner;

public class Quan_Lab2b {
    public static void main(String[] args){
        // TODO: Declare a Scanner
        Scanner input = new Scanner(System.in);

        // TODO: Request and parse user input
        System.out.println("Please enter you name followed by three numbers in accending orders (space separated): ");
        String intString = input.next();
        double a = input.nextDouble(); //7
        double b = input.nextDouble(); //3
        double c = input.nextDouble(); //6
            //-92 1 82
        //Min -91 1 , 1 82
        //Ma 1 , 1
        // Max 1 , 82

        // TODO: Sort values and display
        //This is the Max number
        double maxNumber1 = Math.max(a, b);
        double maxumber1 = Math.max(maxNumber1, c);

        // This is the Mid number
        double maxumber2 = Math.max(Math.min(a,b), Math.min(b,c));
        double max1umber2 = Math.max(Math.min(a,c), Math.min(b,c));
        double max2umber2 = Math.max(max1umber2,maxumber2);

        //This is the least number
        double maxNumber3 = Math.min(a, b);
        double maxumber3 = Math.min(maxNumber3, c);
        System.out.printf("Hi there, %s Here are the numbers you entered in descending order: %n", intString);
        System.out.printf("%.2f, %.2f and %.2f %n", maxumber1, max2umber2, maxumber3);

        //TODO: Thank user
        System.out.println("Thank you for using the three-number-sorting system! Good-bye.");
    }
}
