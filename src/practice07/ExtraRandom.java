package practice07;

import java.util.Random;

public class ExtraRandom {

    public static void main(String[] args) {

        Random generator = new Random(1000);

        System.out.println("Первые 50 случайных целых чисел [0; 100):");
        for (int i = 0; i < 50; i++) {
            int value = generator.nextInt(100);
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
