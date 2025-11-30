package practice14;

import java.util.ArrayList;

public class Task1ArrayList {

    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<>();

        // добавление элементов
        states.add("Германия");
        states.add("Франция");
        states.add("Великобритания");
        states.add("Испания");
        states.add(1, "Италия"); // вставка по индексу

        System.out.println("Элемент с индексом 1: " + states.get(1));

        // замена элемента
        states.set(1, "Дания");

        System.out.printf("В списке %d элементов%n", states.size());
        System.out.println("Содержимое списка:");

        for (String s : states) {
            System.out.println(" - " + s);
        }

        // проверка на наличие элемента
        if (states.contains("Германия")) {
            System.out.println("Список содержит государство Германия");
        } else {
            System.out.println("Германии в списке нет");
        }

        // удаление по значению и по индексу
        states.remove("Франция");
        states.remove(0); // удаляем первый элемент

        System.out.println("\nПосле удаления:");
        for (String s : states) {
            System.out.println(" - " + s);
        }

        // преобразование к массиву
        Object[] arr = states.toArray();
        System.out.println("\nМассив из списка:");
        for (Object o : arr) {
            System.out.println(" * " + o);
        }
    }
}
