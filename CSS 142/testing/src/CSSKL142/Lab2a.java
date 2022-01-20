package CSSKL142;

import java.util.Scanner;

/*
 * Lab2a.java
 *
 * Authors: Samantha Smith, you
 */
// TODO: Import Scanner

public class Lab2a {
    public static void main(String[] args){
        // kelvins and temperaturePrinter tests
        System.out.println("\nTesting kelvins and temperaturePrinter:");
        double f1 = 32;
        temperaturePrinter(f1, kelvins(f1));
        // TODO: Add at least five tests
        double f2 = 45;
        temperaturePrinter(f2, kelvins(f2));
        double f3 = 58;
        temperaturePrinter(f3, kelvins(f3));
        double f4 = 65;
        temperaturePrinter(f4, kelvins(f4));
        double f5 = 85;
        temperaturePrinter(f5, kelvins(f5));

        // inSeconds tests
        System.out.println("\nTesting inSeconds:");
        //inSeconds(1, 5, 1); // Expect: 3901
        // TODO: Add at least 5 tests
        inSeconds(0, 20, 34);
        inSeconds(0, 2, 0); // 120 secs
        inSeconds(24, 0, 0); // 86400 secs
        inSeconds(-1, 61, -60); // 0 secs
        inSeconds(3, 17, 5);
        inSeconds(7, 15, 40);

        // secondTime tests
        System.out.println("\nTesting secondTime:");
        // TODO: Declare a scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input total seconds as an integer");
        
        int val = sc.nextInt();            
        secondTime(val);
        secondTime(9001); // 2 hours, 150 mins, 1 seconds
        secondTime(3600); // 1 hours, 60 mins, 0 seconds

    }

    /**
     * kelvins
     *
     * This method converts a value in F to the corresponding value in K.
     *
     * @param   f   double  The temperature in Farenheit
     * @return  The temeprature in Kelvins
     */
    public static double kelvins(double f) {
        double k = (5.0/9.0) * (f - 32) + 273.15;
        System.out.println();

        return k;
    }

    /**
     * temperaturePrinter
     *
     * This method prints the message "<f> F corresponds to <k> K"
     *
     * @param   f   double  The temperature in Farenheit
     * @param   k   double  The temperature in Kelvins
     */
    public static void temperaturePrinter(double f, double k) {
        // TODO
        System.out.printf("%.2f degree. F equals %.2f degree. K %n", f, k);

        
    }



    /**
     * secondTime
     *
     * This method converts from seconds to hour:minutes:seconds, and prints the
     * result to the console.
     *
     * @param   inputSeconds    int The total seconds to convert
     */
    // TODO: You figure out the declaration and the method!
    public static void secondTime(int seconds){
        
        int hours = seconds / 3600;
        int mins = seconds / 60;
        int secs = seconds % 60;
        System.out.printf("%02d:%2d:%2d %n", hours, mins, secs);
        System.out.printf("meaning %d hours, %d mins, %d seconds %n", hours, mins, secs);
    }
    /**
     * inSeconds
     *
     * This method converts from hours:munites:seconds to seconds, and prints the
     * result to the console.
     *
     * @param   hours   int The hours to convert
     * @param   mins    int The minutes to convert
     * @param   secs    int The seconds to convert
     * @return The total number of seconds
     */
    // TODO: You figure out the declaration and the method!

    public static int inSeconds(int hours, int mins, int secs) {
        int converSec = (hours * 3600) + (mins * 60) + (secs * 1);
        System.out.println(converSec);

        return converSec;

    }

}
