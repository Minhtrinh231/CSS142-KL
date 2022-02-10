package C142Lecture;

public class lecture4 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "callous";

        String c = a.substring(2, 5).substring(0,2).toUpperCase() + b;
        System.out.println(c); // output to lloCallous

        loopFor();
        helloInLine();
        loopNEST();
    }

    public static void loopFor() {
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println();
        }
    }

    public static void helloInLine() {
        String text1 = "hello World";
        int wordLength = text1.length();

        for (int i = 0; i < wordLength; i++) {
            int lower = i;
            int upper = i+1;
            System.out.println(text1.substring(i,i+1));
        }

        //this is use to print hello World in lines
    }

    public static void loopNEST() {
        int j,k,l;

        for (j = 0; j < 4; j++) {
            for (k = 10; k < 13; k++) {
                for ( l = 100; l < 103; l++) {
                    System.out.println(j + " " + k + " " + l);
                }
            }
        }
    }
}
