package practice01;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 7, 9};
        int sum;

        // for
        sum = 0;
        for (int i = 0; i < arr.length; i++) sum += arr[i];
        System.out.println("Сумма (for): " + sum);

        // while
        sum = 0;
        int i = 0;
        while (i < arr.length) sum += arr[i++];
        System.out.println("Сумма (while): " + sum);

        // do-while
        sum = 0;
        i = 0;
        do sum += arr[i++]; while (i < arr.length);
        System.out.println("Сумма (do-while): " + sum);
    }
}
