package experimenting;

import java.util.Scanner;

public class booleantest {
    static Scanner key = new Scanner(System.in);

    public static void main(String[] args) {
        testing();
    }

    public static void testing() {
        System.out.println("Type in the words"); // Try typing hello with upper and lower cases to test equal and equalIgnoreCase
        String input = key.next();
        String wordA = "Hello";
        String wordB = "hello";
        
        if (input.equals(wordA)) {
            System.out.println("These are equal Strings");
        }
        else if (input.equalsIgnoreCase(wordA)) {
            System.out.println("These are equal String with different cases");
        }
        else {
            System.out.println("they are not Strings");
        }

        if (wordA.compareTo(wordB) < 0) {
            System.out.println(wordA + " precedes " + wordB + " in lexicographic ordering");
        } else if (wordA.compareTo(wordB) < 0) {
            System.out.println(wordA + " follows " + wordB + " in lexicographic ordering");
        }
        if (wordA.compareToIgnoreCase(wordB) < 0) { //This compareTo ignore all upper or lower cases
            System.out.println(wordA + " precedes " + wordB + " in alphabeticle ordering");
        }
    }
}
