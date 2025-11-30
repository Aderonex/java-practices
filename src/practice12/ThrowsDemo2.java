package practice12;

public class ThrowsDemo2 {

    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println("Сообщение: " + message);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("Ключ равен null");
        }
        return "Данные для ключа: " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo2 demo = new ThrowsDemo2();

        demo.printMessage("test");
        demo.printMessage(null);
    }
}
