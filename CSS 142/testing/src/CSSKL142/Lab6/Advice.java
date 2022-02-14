package CSSKL142.Lab6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.print.event.PrintEvent;

import experimenting.scanner;

public class Advice {
    public static void main(String[] args) {
        Scanner adInput = null;
        String advices = "";

        try {
            adInput = new Scanner(new FileInputStream("F:\\Desktop\\CSS 142\\testing\\src\\CSSKL142\\Lab6\\advice.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(0);
        }

        while (adInput.hasNextLine()) {
            advices += adInput.nextLine() + "\n";
        }

        adInput.close();

        PrintWriter adOut = null;

        try {
            adOut = new PrintWriter(new FileOutputStream("F:\\Desktop\\CSS 142\\testing\\src\\CSSKL142\\Lab6\\advice.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(0);
        }

        adOut.close();

        System.out.println(advices);

        System.out.println("Please add another advice");
        Scanner key = new Scanner(System.in);

        while (!(advices == "")) {
            advices = key.nextLine();

            try {
                adOut = new PrintWriter(new FileOutputStream("F:\\Desktop\\CSS 142\\testing\\src\\CSSKL142\\Lab6\\advice.txt", true));
            } catch (Exception e) {
                System.out.println("File not found.");
                System.exit(0);
            }

            adOut.println(advices);
            adOut.close();

            try {
                adOut = new PrintWriter(new FileOutputStream("F:\\Desktop\\CSS 142\\testing\\src\\CSSKL142\\Lab6\\adviceLog.txt", true));
            } catch (Exception e) {
                System.out.println("File not found.");
                System.exit(0);
            }

            adOut.println(advices);
            adOut.close();

            //Thanks to David Kim for the help
        }
    }
}
