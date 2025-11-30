package practice11;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printLeftToRight(n);
    }

    private static void printLeftToRight(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        }
        printLeftToRight(n / 10);
        System.out.println(n % 10);
    }
}
