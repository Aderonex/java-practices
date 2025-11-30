package practice01;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        // заполнение
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }

        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("Отсортированный:");
        System.out.println(Arrays.toString(arr));
    }
}
