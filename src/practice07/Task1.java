package practice07;

import java.util.Date;

public class Task1 {

    public static void run() {
        String developer = "Рязанов Андрей Александрович";
        Date received = new Date(2024 - 1900, 11, 30, 17, 0);
        Date submitted = new Date(); // текущая дата

        System.out.println("Разработчик: " + developer);
        System.out.println("Дата получения задания: " + received);
        System.out.println("Дата сдачи задания: " + submitted);
    }
}
