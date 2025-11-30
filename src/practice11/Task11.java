package practice11;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(countOnes(scanner, false));
    }

    private static int countOnes(Scanner scanner, boolean lastWasZero) {
        int x = scanner.nextInt();
        if (lastWasZero && x == 0) {
            return 0;
        }
        int add = (x == 1) ? 1 : 0;
        return add + countOnes(scanner, x == 0);
    }
}
