package practice04;

public enum Season {

    WINTER("Зима", -10, "Холодное время года"),
    SPRING("Весна", 10, "Тает снег, всё начинает расти"),
    SUMMER("Лето", 25, "Тёплое и солнечное время года"),
    AUTUMN("Осень", 5, "Опадают листья, становится холоднее");

    private final String title;
    private final int averageTemp;
    private final String description;

    Season(String title, int averageTemp, String description) {
        this.title = title;
        this.averageTemp = averageTemp;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return title + " (t=" + averageTemp + ") – " + description;
    }

    public static Season favoriteSeason() {
        return SUMMER;
    }
}
