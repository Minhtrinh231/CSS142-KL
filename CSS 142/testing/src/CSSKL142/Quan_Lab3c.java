package CSSKL142;

import java.util.Random;
import java.util.Scanner;

public class Quan_Lab3c {
    public static void main(String[] args) {
        int i = 5;
        while( i >0){
        Scanner input = new Scanner(System.in);
        // TODO: Get user choice
        
        System.out.println("User Input an Int from 0 to 2 (o = rock, 1 = paper, 2 = scissors)");
        int userInput = input.nextInt();
        // TODO: Generate random computer choice
        Random rand = new Random();
        int upperBound = 2;
        int computerInput = rand.nextInt(upperBound);
        int user = 0;
        int comp = 1;
        if(userInput ==1 || userInput ==2 || userInput ==0){
        // TODO: Print choices
        System.out.println(chooseString(person(user),intToWord(userInput),userInput) + "." + chooseString(person(comp),intToWord(computerInput),computerInput));
        // TODO: Determine winner
        System.out.println(score(userInput,computerInput));
    }else{
        System.out.println("Please print it again");
    }
    }
}

    /**
     * intToWord
     *
     * Convert from an integer to the relevant string, using a switch
     *
     * @param    choice    int        The choice to convert
     * @return    TODO
     */
    // TODO: You figure out the declaration and the method!
    public static String intToWord(int choice){
       String a = "";
        switch(choice){
            case 0:
                 a = "rock";
                break;
            case 1:
                 a = "paper";
                break;
            case 2:
                 a = "scissors";
                break;
        }
        return a;
    }

    /**
     * score
     *
     * Determine the winner from two choices
     *
     * @param    userchoice    int    The user's choice
     * @param    compchoice    int    The computer's choice
     * @return    TODO
     */
    // TODO: You figure out the declaration and the method!
    public static int score(int userchoice, int compchoice){
        if (userchoice == 0 && compchoice == 0) {
            System.out.println("Rock with Rock. Tie");
        } else if (userchoice == 0 && compchoice == 1) {
            System.out.println("Paper beat Rock. I win.");
        } else if (userchoice == 0 && compchoice == 2) {
            System.out.println("Rock beat Scissor. You win.");
        } else if (userchoice == 1 && compchoice == 1) {
            System.out.println("Paper with Paper. Tie");
        } else if (userchoice == 1 && compchoice == 2) {
            System.out.println("Scissor beat paper. I win.");
        } else if (userchoice == 1 && compchoice == 0) {
            System.out.println("Paper beat Rock. You win.");
        } else if (userchoice == 2 && compchoice == 2) {
            System.out.println("Scissor witg scissor. Tie");
        } else if (userchoice == 2 && compchoice == 0) {
            System.out.println("Rock beat Scissor. I win.");

        } else if (userchoice == 2 && compchoice == 1) {
            System.out.println("Scissor beat paper. You win.");
        }
        return userchoice + compchoice;
    }


    /**
     * chooseString
     *
     * "<person> chose <string value of choice>."
     *
     * @param    person    String    Either "You" or "I"
     * @param    choice    int        The person's choice
     * @return    TODO
     */
    // TODO: You figure out the declaration and the method!
    public static String chooseString(String person, String choice, int userInput) {
        
        String a = person + " chose " + intToWord(userInput) + ".";
        return a;
    }

    public static String person(int person1) {
        String a = "";
        switch (person1) {
            case 0:
                a = "You";
                break;
        
            case 1:
                a = "I";
                break;
        }
        return a;
    }
}

