package HW;

import java.util.Scanner;

public class HW_Methods {

    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        runProgramA();
        runProgramB();

    }

    public static void runProgramA() {
        String platform = "||";
        String platQuestion = "|?|";

        System.out.println("Program A");
        System.out.println("Mario Board 1:");
        System.out.println(platform);
        System.out.println(platform);
        System.out.println(platform);
        System.out.println(platform + "                                          //Segment 1");
        System.out.println(platform);
        System.out.println(platform);
        System.out.printf("%n");

        System.out.println(platform);
        System.out.println(platform);
        System.out.println(platform + "       " + platQuestion);
        System.out.println(platform);
        System.out.println(platform + "                                          //Segment 2");
        System.out.println(platform + "       " + platQuestion);
        System.out.println(platform);
        System.out.println(platform);
        System.out.printf("%n");

        System.out.println(platform);
        System.out.println(platform);
        System.out.println(platform + platform);
        System.out.println(platform + platform + platform + "                                        //Segment 3");
        System.out.println(platform + platform + platform + platform);
        System.out.println(platform + platform + platform + platform + platform);
        System.out.printf("%n");
        System.out.printf("%n");

        System.out.println(platform + platform + platform + platform +platform);
        System.out.println(platform + platform + platform + platform);
        System.out.println(platform + platform + platform + "                                        //Segment 3 repeat");
        System.out.println(platform + platform);
        System.out.println(platform);
        System.out.println(platform);
        System.out.printf("%n");

        System.out.println(platform);
        System.out.println(platform);
        System.out.println(platform + "       " + platQuestion);
        System.out.println(platform);
        System.out.println(platform + "                                            //Segment 2");
        System.out.println(platform + "       " + platQuestion);
        System.out.println(platform);
        System.out.println(platform);
        System.out.printf("%n");

        System.out.println(platform);
        System.out.println(platform);
        System.out.println(platform + platform);
        System.out.println(platform + platform + platform +"                                          //Segment 4");
        System.out.println(platform + platform + platform + platform);
        System.out.println(platform + platform + platform + platform + platform);
        System.out.println(platform + platform + platform + platform + platform + platform);
        System.out.println(platform);
        System.out.println(platform);
        System.out.println(platform);
        System.out.println(platform + "            ^");
        System.out.println(platform + "|------------");
        System.out.printf("%n");

        System.out.printf("%n");
        System.out.printf("%n");
        System.out.printf("%n");
        System.out.printf("%n");
        System.out.printf("%n");
        System.out.printf("%n");
        System.out.printf("%n");

        System.out.println("Mario board 2:");
        System.out.println(platform);
        System.out.println(platform);
        System.out.println(platform);
        System.out.println(platform + "                                          //Segment 1");
        System.out.println(platform);
        System.out.println(platform);
        System.out.printf("%n");

        System.out.println(platform);
        System.out.println(platform);
        System.out.println(platform + platform);
        System.out.println(platform + platform + platform +"                                       //Segment 2");
        System.out.println(platform + platform + platform + platform);
        System.out.println(platform + platform + platform + platform + platform);
        System.out.printf("%n");

        System.out.println(platform + platform + platform + platform +platform);
        System.out.println(platform + platform + platform + platform);
        System.out.println(platform + platform + platform + "                                       //Segment 3");
        System.out.println(platform + platform);
        System.out.println(platform);
        System.out.println(platform);
        System.out.printf("%n");

        System.out.println(platform);
        System.out.println(platform);
        System.out.println(platform + "       " + platQuestion);
        System.out.println(platform);
        System.out.println(platform + "                                          //Segment 4");
        System.out.println(platform + "       " + platQuestion);
        System.out.println(platform);
        System.out.println(platform);
        System.out.printf("%n");

        System.out.println(platform);
        System.out.println(platform);
        System.out.println(platform + "       " + platQuestion);
        System.out.println(platform);
        System.out.println(platform + "                                          //Segment 4 repeat");
        System.out.println(platform + "       " + platQuestion);
        System.out.println(platform);
        System.out.println(platform);
        System.out.printf("%n");

        System.out.println(platform);
        System.out.println(platform);
        System.out.println(platform + platform);
        System.out.println(platform);
        System.out.println(platform + platform + platform + "                                       //Segment 2 repeat");
        System.out.println(platform);
        System.out.println(platform + platform + platform + platform);
        System.out.println(platform);
        System.out.println(platform + platform + platform + platform + platform);
        System.out.println(platform);
        System.out.println(platform + platform + platform + platform + platform);
        System.out.println(platform + platform + platform + platform + platform);
        System.out.println(platform + platform + platform + platform + platform);
        System.out.println(platform + platform + platform + platform + platform + "                      ^");
        System.out.println(platform + platform + platform + platform + platform + "-----------------------");
        System.out.println();
    }

    public static void runProgramB() {
        String platform = "||";
        String platQuestion = "|?|";
        System.out.println("Program B");
        System.out.println("What would you want mario to look like in text form:");
        String mario = keyboard.next();
        System.out.println("What do you want the coint to look like in text form:");
        String coin = keyboard.next();
        System.out.println();
        System.out.println();

        System.out.printf("What does Mario Look like? %s %n", mario);
        System.out.printf("What does a Coin look like? %s %n", coin);
        System.out.println("Here is your level ...");
        System.out.println(platform);
        System.out.println(platform);
        System.out.println(platform);
        System.out.println(platform);
        System.out.println(platform);
        System.out.println(platform);
        System.out.printf("%n");

        System.out.println(platform);
        System.out.println(platform);
        System.out.println(platform + " " + platQuestion + coin);
        System.out.println(platform);
        System.out.println(platform + " " + platQuestion + coin);
        System.out.println(platform);
        System.out.println(platform);
        System.out.printf("%n");

        System.out.println(platform);
        System.out.println(platform);
        System.out.println(platform + platform + coin);
        System.out.println(platform + platform + platform + coin);
        System.out.println(platform + platform + platform + platform + coin);
        System.out.println(platform + platform + platform + platform + platform);
        System.out.println(platform + platform + platform + platform + platform);
        System.out.println(platform + platform + platform + platform + coin);
        System.out.println(platform + platform + platform + coin);
        System.out.println(platform + platform + coin);
        System.out.println(platform);
        System.out.println(platform);
        System.out.printf("%n");

        System.out.println(platform);
        System.out.println(platform);
        System.out.println(platform + " " + platQuestion + coin);
        System.out.println(platform);
        System.out.println(platform + " " + platQuestion + coin);
        System.out.println(platform);
        System.out.println(platform);
        System.out.printf("%n");

        System.out.println(platform);
        System.out.println(platform);
        System.out.println(platform + coin);
        System.out.println(platform + coin);
        System.out.println(platform + coin);
        System.out.println(platform);
        System.out.println(platform);
        System.out.printf("%n");

        System.out.println(platform + mario);
        System.out.println(platform);
        System.out.println(platform + platform + coin);
        System.out.println(platform + platform + platform + coin);
        System.out.println(platform + platform + platform + platform + coin);
        System.out.println(platform + platform + platform + platform + platform);
        System.out.println(platform);
        System.out.println(platform + "            ^");
        System.out.println(platform + "|------------");

    }

}
