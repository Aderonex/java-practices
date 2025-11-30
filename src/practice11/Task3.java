package practice11;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        printFromAToB(a, b);
    }

    private static void printFromAToB(int a, int b) {
        System.out.print(a + " ");
        if (a == b) return;
        if (a < b) {
            printFromAToB(a + 1, b);
        } else {
            printFromAToB(a - 1, b);
        }
    }
}
