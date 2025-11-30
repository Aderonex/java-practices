package practice11;

import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Result res = process(scanner);
        System.out.println(res.count);
    }

    private static class Result {
        int max;
        int count;

        Result(int max, int count) {
            this.max = max;
            this.count = count;
        }
    }

    private static Result process(Scanner scanner) {
        int x = scanner.nextInt();
        if (x == 0) {
            return new Result(0, 0);
        }
        Result tail = process(scanner);
        if (x > tail.max) {
            return new Result(x, 1);
        } else if (x == tail.max) {
            return new Result(tail.max, tail.count + 1);
        } else {
            return tail;
        }
    }
}
