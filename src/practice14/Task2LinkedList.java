package practice14;

import java.util.LinkedList;

public class Task2LinkedList {

    public static void main(String[] args) {

        LinkedList<String> states = new LinkedList<>();

        // добавление элементов
        states.add("Германия");
        states.add("Франция");
        states.addLast("Великобритания"); // в конец
        states.addFirst("Испания");       // в начало
        states.add(1, "Италия");          // по индексу

        System.out.printf("В списке %d элементов%n", states.size());
        System.out.println("Элемент с индексом 1: " + states.get(1));

        states.set(1, "Дания");

        System.out.println("\nСодержимое списка:");
        for (String s : states) {
            System.out.println(" - " + s);
        }

        if (states.contains("Германия")) {
            System.out.println("\nСписок содержит государство Германия");
        }

        // удаление
        states.remove("Германия");
        states.removeFirst();
        states.removeLast();

        System.out.println("\nПосле удаления крайних элементов:");
        for (String s : states) {
            System.out.println(" - " + s);
        }

        // Пример с собственным классом
        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person("Майк"));
        people.addFirst(new Person("Том"));
        people.addLast(new Person("Ник"));
        people.remove(1); // удалим второго

        System.out.println("\nСписок людей:");
        for (Person p : people) {
            System.out.println(" - " + p.getName());
        }

        Person first = people.getFirst();
        System.out.println("Первый в списке людей: " + first.getName());
    }
}

class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
