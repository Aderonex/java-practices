package practice07;

import java.text.SimpleDateFormat;
import java.util.Date;

class Student {
    private String name;
    private Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String formatBirthDate(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(birthDate);
    }

    @Override
    public String toString() {
        return "Студент: " + name + ", дата рождения: " + birthDate;
    }
}

public class Task3 {
    public static void run() {
        Student st = new Student(
                "Рязанов Андрей Александрович",
                new Date(2004 - 1900, 11, 25)
        );

        System.out.println(st);
        System.out.println("Короткий формат: " + st.formatBirthDate("dd.MM.yyyy"));
        System.out.println("Средний формат: " + st.formatBirthDate("d MMM yyyy"));
        System.out.println("Полный формат: " + st.formatBirthDate("EEEE, d MMMM yyyy"));
    }
}
