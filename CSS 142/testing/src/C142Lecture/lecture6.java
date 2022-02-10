package C142Lecture;

public class lecture6 {
    public static void main(String[] args) {
        // testadd();
        loopsTest();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void testadd() {
        int x = 1;
        int y = 2;
        System.out.println("sum 1 and 2 is " + add(x, y));
    }
    // this method is testing

    public static void loopsTest() {
        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.printf("%d ", j);
            }
            System.out.println();
        }
    }
}

/**
 * Preview:
 * - Debugging
 * - More comple loops (nested)
 * 
 * Debugging:
 * - Your common problems
 * - Techniques that you used to debugged; such as checking spelling mistakes,
 * testing one section at the time.
 * 
 * common errors:
 * - syntax errors: brackets & parenthesies
 * - logic errors: dividing by wrong numbers
 * - grammatical errors
 * - overly complex nested if-else and loops
 * - where you declare matters (is it inside the method or outside).
 * - branching: not all logical options are covered
 * 
 * Technique to debug:
 * - println variables
 * - rubber duck debugging
 * - compiling frequently and checking for grammatical error
 * - code in small segments
 * - ask for another person help
 * - create truth table
 * - test ur code
 * - for loops to do a hand calculations for a few iterations
 * 
 * Testing code:
 * - unit test: lowest level, testing a method, most foundational
 * - intergration test: communication between components
 * - system test: all components together,
 * and to see if the entire operation works
 * 
 * Loops:
 * - use for loops when you know ahead of times to repeat
 * - while and do-while when not knowing how many # to repeats
 * - do-while is when you want the body to run 1 time, and
 * while loops are depends if it runs or not depends on the
 * conditions.
 * - nested loops is a loop inside a loops, all run for each iterations
 * 
 */
