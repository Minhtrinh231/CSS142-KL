package HW;

import java.util.Scanner;

public class HW_WarmUp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //TODO 1
        System.out.println("TODO 1: Enter the number");
          int number = keyboard.nextInt();
          if(number < 0) {  //you must fix this pseudocode before you can compile it
            System.out.println("The number is negative");
          }
          else {
            System.out.println("The number is not negative");
          }
        
        //TODO 2
        System.out.println("TODO 2: Enter a second number");
        number = keyboard.nextInt();
        if (number == 0) {
            System.out.println("The number is 0");
        } else {
            System.out.println("Number is not 0");
        }

        //TODO 3
        System.out.println("TODO 3: Enter a thrid number, a double, for the class average");
        double average = Double.valueOf(number);
        average = keyboard.nextDouble();
        if (average >= 65) {
            System.out.println("You passed");
        } else {
            System.out.println("You failed");
        }

        //TODO 4 & TODO 5
        System.out.println("TODO 4: Is the answer the user reported true?  Enter a Boolean value.");
        boolean answer = keyboard.nextBoolean();
        if (answer) {
            System.out.println("The user report is true");
        //TODO 5
        } else {
            System.out.println(" TODO 5:The user report is false");
        }

        //TODO 6
        System.out.println("TODO 6: Input a number to determine if the number is even or odd");
        number = keyboard.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        } 

        //TODO 7 & TODO 8
        System.out.println("TODO 7: Input the grade to determine if the grade is in the A range");
        float grade = keyboard.nextFloat();
        float gradeA = 90.0f;
        float gradeB = 80.0f;
        if (grade >= gradeA) {
            System.out.println("Your grade is above the A range");
        }
        else if (grade <= gradeA && grade >= gradeB) {
            System.out.println("TODO 8: Your grade is in the B range");
        }
        else {
            System.out.println("Your grade is below the A and B range");
        } 
        
        //TODO 9
        System.out.println("TODO 9: Please input temperature");
        double temperature = keyboard.nextDouble();
        if (temperature > 78) {
            System.out.println("The temperature is higher than 78");
        } 
        else if (temperature == 78) {
            System.out.println("The temperature is equal to 78");
        } 
        else {
            System.out.println("The temperature is less than 78");
        } 
        

        //TODO 10
        System.out.println("TODO 10: Is the temparature (positive and odd) or (zero and even)");
        //number = keyboard.nextInt();
        if ((temperature > 0 && temperature % 2 != 0) || (temperature == 0 && temperature % 2 == 0)) {
            System.out.println("Yes; positive and odd or zero and even");
        } else {
            System.out.println("No; its not positive and odd or zero and even");
        }
        /* if ((temperature > 0) && (temperature % 2 != 0)) {
            System.out.println("Yes; positive and odd or zero and even");
        } 
        else if ((temperature == 0) && (temperature % 2 == 0)) {
            System.out.println("Yes; positive and odd or zero and even");
        }
        else {
            System.out.println("No; its not positive and odd or zero and even");
        } */

        //TODO 11
        System.out.println("TODO 11: Please input your letter grading");
        char letter = keyboard.next().charAt(0);
        if (letter == 'A') {
            System.out.println("Is the grade A");
        } 
        else if (letter == 'B') {
            System.out.println("Is the grade B");
        }
        else if (letter == 'C') {
            System.out.println("Is the grade C");
        }
        else if (letter == 'D') {
            System.out.println("Is the grade D");
        }
        else if (letter == 'F') {
            System.out.println("Is the grade F");
        }
        else {
            System.out.println("Sorry this is an Invalid letter");
        }

        //TODO 12
        System.out.println("TODO 12: Please input two numbers");
        System.out.println("input 1st number");
        int a = keyboard.nextInt();
        System.out.println("input 2nd Number");
        int b = keyboard.nextInt();
        System.out.println("The largest number is " + max(a, b));

        //TODO 13
        System.out.println("TODO 13: Please input two numbers");
        System.out.println("input 1st number");
        int numb1 = keyboard.nextInt();
        System.out.println("input 2nd Number");
        int numb2 = keyboard.nextInt();
        int max = Math.max(numb1, numb2);
        System.out.println("The largest number is " + max);
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

