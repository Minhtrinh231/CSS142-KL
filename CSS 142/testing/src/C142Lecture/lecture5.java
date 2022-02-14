package C142Lecture;

public class lecture5 {
    public static void main(String[] args) {
        // forLoopNest1();
        // ifNesting();
        // ICAfromLastClass();
        //Loop_and_other();
        loopTest();
    }

    public static void forLoopNest1() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello");
            for (int k = 0; k < 3; k++) {
                System.out.println("Hi");
                for (int j = 0; j < 3; j++) {
                    System.out.println("i");
                }
            }
        }
    }

    public static void ifNesting() {
        int input = 1;
        if (input > 0) {
            System.out.println("if outside works");
            if (input > 0) {
                System.out.println("if inside works");
            }
        } else {
            System.out.println("none of them work");
        }
    }

    public static void ICAfromLastClass() {
        for (int i = 1; i <= 5; i++) {
            // System.out.printf("%n");
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%4d", i * j++);
            }
            System.out.println();
        }

    }

    public static void Loop_and_other() {
        int i = 1;
        int o = 1;
        while (i > 0) {
            o++;
            System.out.println("hallo");
            System.out.println(o);
        }

        
    }

    public static void loopTest() {
        int n;
        for (int i = 1; i <= 2; i++) {
            n = i + 3;
        for (int j = n; j <= 10; j += n) {
        System.out.println(j);
        }
        System.out.println(n);
      }
    }
}

/*
 * Preview:
 * Question to HW: Branching
 * Questions about the midterms
 * Revisit ICA from lastweek with the multiplication table.
 * A little bit about debugging
 * 
 * for loop: know ahead of time #time the loop should run
 * for (int i=0; i<5; i++)
 * you know that it will run for 5 times
 * 
 * while and do-while: don't know ahead of time, you don't know how #times it
 * will run
 * int i = 0;
 * while(i>=0){
 * read from the keyboard input and set value i
 * }
 * 
 * while loop: 0 + time
 * do-while: iterate 1 time
 */