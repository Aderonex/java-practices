package practice11;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        factorize(n, 2);
    }

    private static void factorize(int n, int d) {
        if (n == 1) return;
        if (d * d > n) {
            System.out.print(n + " ");
            return;
        }
        if (n % d == 0) {
            System.out.print(d + " ");
            factorize(n / d, d);
        } else {
            factorize(n, d + 1);
        }
    }
}
