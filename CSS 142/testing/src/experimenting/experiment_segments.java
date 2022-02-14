package experimenting;

import java.util.Scanner;

public class experiment_segments {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("input 1st number");
        int a = keyboard.nextInt();
        System.out.println("input 2nd Number");
        int b = keyboard.nextInt();
        System.out.println("The largest number is " + max(a, b));
        
    }

    public static int max(int a, int b) {
        //TODO 12
        if (a > b) {
            return a;
        } 
        else {
            return b;
        }
    }
}
