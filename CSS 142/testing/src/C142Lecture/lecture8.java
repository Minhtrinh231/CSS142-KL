package C142Lecture;

public class lecture8 {
    public static void main(String[] args) {
        Accessing();
        ICA();
    }

    public static void Accessing() {
        int[] numCars = new int[10];
        for (int i = 0; i < numCars.length; i++) {
            numCars[i] = 0;
        }
        System.out.println(numCars);
    }

    public static void ICA() {
        double sum = 0.0;
        double[] data = new double[6];
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        double avg = sum / data.length;

        System.out.println(avg);
    }
}

/**
 * Review:
 * - Loops: for, while, do-while.
 * - Branching: different paths, (if, if-else, multiway), booleans.
 * - Methods: package of codes to reuse.
 * - Variables/Values: primitive types, Data types.
 * - Input/Output: console, files.
 * 
 * Data structure: collection
 * - Array:
 * - int [] numBirds = new int [8];
 * -----------------------------------------------------
 * - (int []) = intarray.
 * - (numBirds) = name of the intarray.
 * - (new) = creat a new object of a particular object.
 * - (int [8]) = size of the array.
 * - an array can be anytype of array
 * ------------------------------------------------------
 * - for string use |(str.length();|
 * - for array use |num.length|
 */
