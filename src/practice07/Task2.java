package practice07;

import java.util.Date;
import java.util.Scanner;

public class Task2 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите дату (год месяц день): ");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        Date userDate = new Date(year - 1900, month - 1, day);
        Date now = new Date();

        System.out.println("Текущая дата: " + now);
        System.out.println("Введённая дата: " + userDate);

        if (userDate.before(now)) {
            System.out.println("Введённая дата — ПРОШЛОЕ");
        } else if (userDate.after(now)) {
            System.out.println("Введённая дата — БУДУЩЕЕ");
        } else {
            System.out.println("Даты совпадают");
        }
    }
}
