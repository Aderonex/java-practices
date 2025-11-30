package practice11;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printFrom1ToN(1, n);
    }

    private static void printFrom1ToN(int current, int n) {
        if (current > n) return;
        System.out.print(current + " ");
        printFrom1ToN(current + 1, n);
    }
}
