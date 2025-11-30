package practice11;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printRightToLeft(n);
    }

    private static void printRightToLeft(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        }
        System.out.println(n % 10);
        printRightToLeft(n / 10);
    }
}
