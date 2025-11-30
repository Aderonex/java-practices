package practice07;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {

    public static void run() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите Год Месяц День Часы Минуты: ");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        Date date = new Date(year - 1900, month - 1, day, hour, minute);

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hour, minute);

        System.out.println("Date: " + date);
        System.out.println("Calendar: " + calendar.getTime());
    }
}
