package practice09;

import java.util.Random;

public class StopWatchDemo {

    public static void main(String[] args) {

        int n = 100_000;
        int[] data = new int[n];

        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            data[i] = rnd.nextInt(1_000_000);
        }

        StopWatch sw = new StopWatch();
        sw.start();

        selectionSort(data);

        sw.stop();

        System.out.println("Время сортировки выбором " + n +
                " чисел = " + sw.getElapsedTime() + " мс");
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
