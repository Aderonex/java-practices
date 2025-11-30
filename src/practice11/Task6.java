package practice11;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (isPrime(n, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isPrime(int n, int d) {
        if (n < 2) return false;
        if (d * d > n) return true;
        if (n % d == 0) return false;
        return isPrime(n, d + 1);
    }
}
