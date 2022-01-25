package C142Lecture;

import java.util.Scanner;

/*This is a lecture for Section 3.1*/

public class lecture2 {

    static Scanner key = new Scanner(System.in);

    public static void main(String[] args) {
        String hello = "Hello";
        System.out.println("hello \"hey\"");
        System.out.println("\"" + hello + "\""); // \"Hello\" is for "Hello"
        Boolean();
    }

    public static void Boolean() {
        int boo = key.nextInt();
        boolean a = boo > 0;

        System.out.println("Is it greater than 0? " + a);
    }
}
