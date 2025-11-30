package practice11;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        System.out.println(countNumbers(k, s, 0));
    }

    private static int countNumbers(int k, int s, int position) {
        if (position == k) {
            return s == 0 ? 1 : 0;
        }

        int from = (position == 0) ? 1 : 0;
        int to = 9;
        int count = 0;

        for (int digit = from; digit <= to; digit++) {
            if (s - digit < 0) continue;
            count += countNumbers(k, s - digit, position + 1);
        }
        return count;
    }
}
