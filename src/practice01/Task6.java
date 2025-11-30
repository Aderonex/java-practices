package practice01;

public class Task6 {

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Факториал 5 = " + factorial(5));
        System.out.println("Факториал 7 = " + factorial(7));
    }
}
