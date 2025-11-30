package practice11;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printOdds(scanner);
    }

    private static void printOdds(Scanner scanner) {
        int x = scanner.nextInt();
        if (x == 0) return;
        if (x % 2 == 1) {
            System.out.println(x);
        }
        printOdds(scanner);
    }
}
