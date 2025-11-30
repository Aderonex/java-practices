package practice11;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printOddIndex(scanner, 1);
    }

    private static void printOddIndex(Scanner scanner, int index) {
        int x = scanner.nextInt();
        if (x == 0) return;
        if (index % 2 == 1) {
            System.out.println(x);
        }
        printOddIndex(scanner, index + 1);
    }
}
