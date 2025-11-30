package practice14;

public class Task3MyArrayListDemo {

    public static void main(String[] args) {

        MyArrayList<String> list = new MyArrayList<>();

        System.out.println("Добавляем элементы:");
        list.add("Германия");
        list.add("Франция");
        list.add("Испания");
        System.out.println(list);

        System.out.println("\nВставляем 'Италия' на позицию 1:");
        list.add(1, "Италия");
        System.out.println(list);

        System.out.println("\nЭлемент с индексом 2: " + list.get(2));

        System.out.println("\nЗаменяем элемент с индексом 0 на 'Дания':");
        list.set(0, "Дания");
        System.out.println(list);

        System.out.println("\nУдаляем элемент с индексом 2:");
        String removed = list.remove(2);
        System.out.println("Удалён: " + removed);
        System.out.println(list);

        System.out.println("\nРазмер списка: " + list.size());
        System.out.println("Пустой ли список? " + list.isEmpty());
    }
}
