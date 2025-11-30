package practice11;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int printed = 0;
        for (int k = 1; printed < n; k++) {
            for (int i = 0; i < k && printed < n; i++) {
                System.out.print(k + " ");
                printed++;
            }
        }
    }
}
