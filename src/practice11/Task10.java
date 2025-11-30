package practice11;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(reverse(n, 0));
    }

    private static int reverse(int n, int acc) {
        if (n == 0) return acc;
        return reverse(n / 10, acc * 10 + n % 10);
    }
}
