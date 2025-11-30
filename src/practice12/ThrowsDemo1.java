package practice12;

public class ThrowsDemo1 {

    public void getDetails(String key) {
        if (key == null) {
            // своё сообщение на русском
            throw new NullPointerException("Ключ равен null");
        }

        System.out.println("Данные для ключа: " + key);
    }

    public static void main(String[] args) {
        ThrowsDemo1 demo = new ThrowsDemo1();

        try {
            demo.getDetails(null);
        } catch (NullPointerException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }
    }
}
