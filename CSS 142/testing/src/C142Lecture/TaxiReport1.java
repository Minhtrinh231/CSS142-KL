package C142Lecture;

/**
 * A program to write a taxi report, version 1.
 *
 * You've been hired by a taxi company to write a program that receives
 * reports from its drivers at the end of the day where they provide, for
 * each ride, the amount of the fare (in $) and the number of customers
 * for that ride.  You will know the last ride has been entered for a given
 * driver if the last fare is negative (of course, the fare amount is the
 * absolute value of that amount, but the last driver knows to enter it in
 * as a negative number).  You will know the last driver has entered their
 * information if the last fare is negative and the last number of customers
 * for that ride is negative.  Your program should provide a report of (1)
 * how many rides occurred during the day, and (2) what was the total gross
 * receipts from all your drivers, (3) what was the average fare for a ride,
 * and (4) the total number of customers served during the day.
 * 
 * Johnny Lin 
 * September 2017
 */

import java.util.Scanner;

public class TaxiReport1
{
    public static void main(String[] args)
    {
        Scanner scannerObject = new Scanner(System.in);
        boolean isLastDriver = false;
        boolean isLastRideForDriver = false;
        int totalRides = 0;
        double totalFareReceipts = 0.0;
        int totalNumCustomers = 0;
        int totalDrivers = 0;

        do {
            System.out.print("Serving Driver ");
            System.out.println(totalDrivers+1);
            do {
                System.out.print("Enter fare amount for a ride:  ");
                double fare = scannerObject.nextDouble();
                System.out.print("Enter number customers for a ride:  ");
                int customers = scannerObject.nextInt();
                System.out.println("");

                totalRides++;
                totalFareReceipts += Math.abs(fare);
                totalNumCustomers += Math.abs(customers);

                if (fare < 0.0) {
                    isLastRideForDriver = true;
                    totalDrivers++;
                    if (customers < 0) {
                        isLastDriver = true;
                    }
                }
            } while (!isLastRideForDriver);
        } while (!isLastDriver);

        System.out.println("Total rides: " + totalRides);
        System.out.println("Total gross receipts: $" + totalFareReceipts);
        System.out.println("Average fare for a ride: $" + 
                           (totalFareReceipts/totalRides));
        System.out.println("Total number customers: " + totalNumCustomers);
    }
}
