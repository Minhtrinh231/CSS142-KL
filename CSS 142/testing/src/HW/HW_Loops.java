package HW;

import java.util.Scanner;

public class HW_Loops {

    static Scanner keyB = new Scanner(System.in);

    public static void main(String[] args) {
        int s = 0;
        //Asking user to input the DNA strand.
        while (++s <= 2) {
            System.out.print("Sequence ");
            System.out.print((s) + ": ");
            String userIn = keyB.nextLine();
            validCheck(userIn);
            checkC(userIn);
            CG_ratio(userIn);
            complement(userIn);
            System.out.println('\n');
        }
        //Output best score for alignment.
        alignment();
    }

    /**Check if the input is valid or invalid. */
    public static boolean validCheck(String userIn) {
        boolean checkValid = true;
        int countChar = 0;
        //This for loops add one everytime to countChar 
        //if the character matches the required characters.
        for (int i = 0; i < userIn.length(); i++) {
            if (userIn.charAt(i) == 'A' || userIn.charAt(i) == 'T' || userIn.charAt(i) == 'G' || userIn.charAt(i) == 'C') {
                countChar += 1;
            } else {
                countChar = 0;
            }
        }
        //Check if countChar is equal to DNA length.
        if (countChar == userIn.length()) {
            checkValid = true;
            System.out.println("Valid Input.");
        } else {
            checkValid = false;
            System.out.println("Invalid Input, Please use G, A, T, or C.");
        }
        
        return checkValid;
    }
    
    /**This method counts for any C's in the DNA. */
    public static int checkC(String userIn) {
        int countC = 0;
        //This for loops count for C in the DNA.
        for (int j = 0; j < userIn.length(); j++) {
            if (userIn.charAt(j) == 'C') {
                countC += 1;
            } else {
                countC += 0;
            }
        }
        //Checks if count is larger than 0.
        if (countC > 0) {
            System.out.printf("C-count: %d %n", countC);
        } else {
            System.out.printf("C-count: %d %n", countC);
        }

        return countC;
    }
    
    /**This method finds the ratio for C and G in the DNA. */
    public static double CG_ratio(String userIn) {
        int countG = 0;
        int countC = 0;
        double ratio = 0.0;
        double userInNum = userIn.length();
        
        //This for loops counts for G.
        for (int k = 0; k < userIn.length(); k++) {
            if (userIn.charAt(k) == 'G') {
                countG += 1;
            } else {
                countG += 0;
            }
        }

        //This for loops counts for C.
        for (int k = 0; k < userIn.length(); k++) {
            if (userIn.charAt(k) == 'C') {
                countC += 1;
            } else {
                countC += 0;
            }
        }

        //This calculates and prints the CG-ratio.
        ratio = ((countG + countC) / userInNum);
        System.out.printf("CG-ratio: %.3f %n", ratio);

        return ratio;
    }

    /** This methods find the compliment for each character
     * and replaced them with the appropriate character from
     * the list (G, A, T, C).
     */
    public static String complement(String userIn) {
        String charLength = userIn;
        String newChar = "";
        
        //The nested if-else will compare each character 
        //and replacing it with its appropriate complements. 
        for (int n = 0; n < userIn.length(); n++) {
            if (charLength.charAt(n) == 'A') {
                newChar += 'T';
            } else {
                if (charLength.charAt(n) == 'T') {
                    newChar += 'A';
                } else {
                    if (charLength.charAt(n) == 'G') {
                        newChar += 'C';
                    } else {
                        if (charLength.charAt(n) == 'C') {
                            newChar += 'G';
                        }
                    }
                }
            }
        }

        //Print out the appropriate complements.
        System.out.printf("Compliment: %s", newChar);

        return newChar;
    }

    /** This method compare each characters 
     * to see if they are aligned or not.
     */
    public static int alignment() {
        //Ask user to re-state the 2 DNA strand,
        System.out.print("Please re-type the 1st DNA: ");
        String strand_1 = keyB.nextLine();
        System.out.print("Please re-type the 2nd DNA: ");
        String strand_2 = keyB.nextLine();
        int countS = 0;

        //This compare each character to each other
        //and add points if the character match 
        //each other.
        for (int m = 0;(m < strand_1.length() && m < strand_2.length()); m++) {
            if (strand_1.charAt(m) == strand_2.charAt(m)) {
                countS++;
            }
        }

        //Print out the top score and the two strands.
        System.out.printf("Best Alignment Score: %d %n", countS);
        System.out.println(strand_1);
        System.out.println(strand_2);

        return countS;
    }
}
