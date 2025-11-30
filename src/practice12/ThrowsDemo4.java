package practice12;

import java.util.Scanner;

public class ThrowsDemo4 {

    public void getKey() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите ключ (пустая строка запрещена): ");
            String key = scanner.nextLine();

            try {
                printDetails(key);
                System.out.println("Всё прошло успешно.");
                break; // если без ошибок — выходим из цикла
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
                System.out.println("Попробуйте ещё раз.\n");
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String details = getDetails(key);
        System.out.println("Результат: " + details);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Ключ не может быть пустой строкой");
        }
        return "Данные для ключа: " + key;
    }

    public static void main(String[] args) {
        new ThrowsDemo4().getKey();
    }
}
