package practice06;

public class Main {

    public static void main(String[] args) {

        StringProcessor processor = new ProcessStrings();

        String text = "бим бим бам";

        System.out.println("Строка: " + text);
        System.out.println("Длина: " + processor.countChars(text));
        System.out.println("Нечётные позиции: " + processor.oddPositionChars(text));
        System.out.println("Инверсия: " + processor.reverse(text));
    }
}
