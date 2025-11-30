package practice11;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // нули
        int b = scanner.nextInt(); // единицы
        System.out.println(countSeq(a, b));
    }

    private static long countSeq(int zeros, int ones) {
        if (zeros < 0 || ones < 0) return 0;
        if (zeros == 0) return 1;
        if (ones == 0) return zeros == 1 ? 1 : 0;
        // либо ставим 1, либо ставим 10 (после нуля обязательно 1)
        return countSeq(zeros, ones - 1) + countSeq(zeros - 1, ones - 1);
    }
}
