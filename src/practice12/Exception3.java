package practice12;

import java.util.Scanner;

public class Exception3 {

    public void exceptionDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");

        try {
            String intString = scanner.next();
            int i = Integer.parseInt(intString);
            System.out.println("Результат 2 / " + i + " = " + (2 / i));
        }
        catch (Exception e) {
            System.out.println("Произошло исключение: " + e.getClass().getSimpleName()
                    + " — " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new Exception3().exceptionDemo();
    }
}
