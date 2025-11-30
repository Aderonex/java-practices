package practice01;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(100);
        }

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("Отсортированный:");
        System.out.println(Arrays.toString(arr));
    }
}
