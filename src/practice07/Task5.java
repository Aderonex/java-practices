package practice07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task5 {

    private static long testInsert(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            list.add(0, i);
        }
        return System.nanoTime() - start;
    }

    private static long testAdd(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < 20000; i++) {
            list.add(i);
        }
        return System.nanoTime() - start;
    }

    private static long testSearch(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < 5000; i++) {
            list.contains(9999);
        }
        return System.nanoTime() - start;
    }

    public static void run() {

        List<Integer> arr = new ArrayList<>();
        List<Integer> link = new LinkedList<>();

        System.out.println("INSERT ArrayList: " + testInsert(arr));
        System.out.println("INSERT LinkedList: " + testInsert(link));

        arr.clear();
        link.clear();

        System.out.println("ADD ArrayList: " + testAdd(arr));
        System.out.println("ADD LinkedList: " + testAdd(link));

        System.out.println("SEARCH ArrayList: " + testSearch(arr));
        System.out.println("SEARCH LinkedList: " + testSearch(link));
    }
}
