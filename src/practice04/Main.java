package practice04;

public class Main {

    public static void main(String[] args) {

        System.out.println("Вывод всех времён года:");
        for (Season s : Season.values()) {
            System.out.println(
                    s.name() + " | ordinal=" + s.ordinal() +
                            " | " + s.toString()
            );
        }

        System.out.println("\nПолучение Enum по строке:");
        Season spring = Season.valueOf("SPRING");
        System.out.println("valueOf(\"SPRING\") = " + spring);

        System.out.println("\nЛюбимое время года:");
        System.out.println(Season.favoriteSeason());
    }
}
