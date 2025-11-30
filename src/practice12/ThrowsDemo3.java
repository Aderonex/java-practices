package practice12;

import java.util.Scanner;

public class ThrowsDemo3 {

    public void getKey() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ключ (строка): ");
        String key = scanner.nextLine();

        try {
            printDetails(key);
        } catch (Exception e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }

    public void printDetails(String key) throws Exception {
        String details = getDetails(key);
        System.out.println("Результат: " + details);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Ключ установлен в пустую строку");
        }
        return "Данные для ключа: " + key;
    }

    public static void main(String[] args) throws Exception {
        new ThrowsDemo3().getKey();
    }
}
