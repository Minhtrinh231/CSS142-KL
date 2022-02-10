package experimenting;
/* This is a testing enviornment for different types variables and strings */

import java.text.DecimalFormat;
import java.text.NumberFormat;
//import java.util.Currency;
import java.util.Locale;

public class variablesstringttesing {
    public static void main(String[] args) {
        starting();
    }

    public static void starting() {
        String a = "Hey there world!";
        int b = 5 + 5;
        //double hash;
        //hash = (11.5 + 15) / 3;
        double longNum = 12.321;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("00000.00");
        DecimalFormat decimalFormat2 = new DecimalFormat("#0.0#");

        System.out.println("Equals =" + 15);
        System.out.println(b + " hello world \n" + a);
        System.out.printf("%6.3f \n", longNum);
        System.out.print("TESTING \n");
        System.out.printf("The price is $%.2f each \n", longNum);
        System.out.println(numberFormat.format(200.123456));
        System.out.println(decimalFormat.format(123.654));
        System.out.println(decimalFormat2.format(123.654));
    }
}
