package PCA;

/* PCA: Branching and Boolean Expressions 1 (S3.1) */

import java.util.Scanner;

public class PCA2 {

    static Scanner keyboard = new Scanner(System.in);
    static boolean isBrithday;
    //static int speeding = keyboard.nextInt();

    public static void main(String[] args) {
        caughtSpeeding();
    }

    public static void caughtSpeeding() {

        System.out.print("Input Your Vehicle Speed: ");
        int speeding = keyboard.nextInt();
        System.out.println("Your Input Speed is " + speeding);

        if (speeding <= 60 ) {
            //isBrithday = true;
            System.out.println("Your recive a no ticket.");
        }

        else if (speeding >= 61 && speeding <= 80) {
            System.out.println("You recive a small ticket.");
        }

        else if (speeding >= 81){
            System.out.println("You recive a big ticket.");

        }

        else {
            System.out.println("You are not driving a vehicle.");
        }
    }

    
}
