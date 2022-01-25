package C142Lecture;

/* This is the lecture on 1.4 and Chapter 2 of Savitch's JAVA books */

public class lecture1 {

    public static double gravAccel = 9.81; // declare varialbe for public use in public class lecture1

    public static void main(String[] args) {
        Force();
        plus4(3, 4); // input int values to method plus4
    }

    public static void Force() {
        //F = ma
        double force = 1.0 * gravAccel;
        int conversiongravAccel = (int)gravAccel; // force convert the double of 9.81 to int of 9

        System.out.println(force);
        System.out.println(conversiongravAccel);
    }

    public static int plus4(int inputVal1, int intputVal2) {
        int x = inputVal1 + intputVal2; // taking the input from main and calculate
        System.out.println(x);

        return x; // return the calculated value to x
    }
}
