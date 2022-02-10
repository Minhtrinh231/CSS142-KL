package C142Lecture;

//Lecture section 3.2 and 1.3

public class lecture3 {
    public static void main(String[] args) {
        String myCoin = "@";
        segment1("ayo"); //ayo will go into the method segment1 String
        segment1(myCoin); // the myCoin inside the segment1 is a argument
        ifStatment();
    }

    //"String input" is parameters
    //the "String input" will get the ayo from main and used it as the new string
    public static void segment1(String intput) {
        System.out.println("|");
        System.out.println("|");
        System.out.println("|" + intput);
        System.out.println("|");
        System.out.println("|");
    }

    public static void ifStatment() {
        // result = a && b
        boolean a = true;
        boolean b = false;
        boolean result;

        // if a is true then check if b is true
        if (a == true /* to check if a is true*/) {
            if (b == true /* check for if b is true*/) {
                result = true;
            } else {
                result = false;
            }
        } else /* if b is false then run else */ {
            result = false;
        }

        System.out.println(result); // this will print out if "a && b" true or false
    }
}
