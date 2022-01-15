package HW;

public class HW_Methods {
    public static void main(String[] args) {
        calNumb();
    }

    public static void calNumb() {
        int result1 = (7 * 3) % 4 - (2 * 6) / 5 + 10 / (3 / 2);
        int result2 = 2 / (4 - 3) + ((5 * 4 % 3 * 5 - 6) * 2) - 5;
        int i = 10, j = 20, k;
        k = ++i - j--;
        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(k);
        System.out.println(k);
    }
}
