package practice07;

import java.util.Date;

public class ExtraDate {

    public static void main(String[] args) {

        long[] times = {
                10_000L,
                100_000L,
                1_000_000L,
                10_000_000L,
                100_000_000L,
                1_000_000_000L,
                10_000_000_000L,
                100_000_000_000L
        };

        for (long t : times) {
            Date date = new Date(t);
            System.out.println("Прошедшее время = " + t +
                    " мс, дата = " + date.toString());
        }
    }
}
