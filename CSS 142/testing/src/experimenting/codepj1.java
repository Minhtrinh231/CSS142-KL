package experimenting;


public class codepj1 {
    public static void main(String[] args) {
        CalculationTotalCaloriesBurned();
    }

    public static void CalculationTotalCaloriesBurned() {
        int METS1;
        METS1 = 16;
        int WEIGHTS;
        WEIGHTS = 150;
        double calopermin = 0.0175;
        double caloMin = calopermin * METS1 * WEIGHTS;

        System.out.print(caloMin);

    }
}
