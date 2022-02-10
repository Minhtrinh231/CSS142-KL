package experimenting;

import java.util.logging.Handler;

public class midterms1 {
    public static void main(String[] args) {
        String x = "java";
        String y = "tyler";
        String z = "tv";
        String rugby = "hamburger";
        String java = "donnie";

        hamburger(x, y, z);
        hamburger(z, x, y);

        //mystery(5, 0);
        //mystery(3, 2);
       // mystery(16, 5);
        //mystery(80, 9);
        //mystery(1600, 40);

        test();

        

    }

    public static void hamburger(String y, String z, String x) {
        System.out.println(z + " and " + x + " like " + y);
    }

    public static void mystery(int i, int j) {
        while (i != 0 && j != 0) {
            i = i / j;
            j = (j - 1) / 2;
            System.out.print(i + " " + j + " ");
        }
        System.out.println(i);
    }

    public static boolean hasMidpoint (int x, int y, int z) {
        int cal = (x + y + z) / 2;
        boolean hasBool;
            
        if (cal != 0) {
            hasBool = false;
        } 
        else {
          hasBool = true;
        }
        return hasBool;
    }

    public static void test() {
        
        for (int i = 5; i >= 0; i--) {
            
            System.out.printf("%d, ", i);
        }
        System.out.print("Liftoff!");
    }
}
