package practice07;

import java.util.GregorianCalendar;

public class ExtraGregorian {

    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();

        int year = calendar.get(GregorianCalendar.YEAR);
        int month = calendar.get(GregorianCalendar.MONTH) + 1; // 0–11 -> 1–12
        int day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Текущая дата:");
        System.out.println("Год: " + year +
                ", месяц: " + month +
                ", день: " + day);

        calendar.setTimeInMillis(1234567898765L);

        int year2 = calendar.get(GregorianCalendar.YEAR);
        int month2 = calendar.get(GregorianCalendar.MONTH) + 1;
        int day2 = calendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Дата для 1234567898765L:");
        System.out.println("Год: " + year2 +
                ", месяц: " + month2 +
                ", день: " + day2);
    }
}
