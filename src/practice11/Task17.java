package practice11;

import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(maxSeq(scanner));
    }

    private static int maxSeq(Scanner scanner) {
        int x = scanner.nextInt();
        if (x == 0) return 0;
        int tailMax = maxSeq(scanner);
        return Math.max(x, tailMax);
    }
}
