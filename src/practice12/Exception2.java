package practice12;

import java.util.Scanner;

public class Exception2 {

    public void exceptionDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");

        try {
            String intString = scanner.next();
            int i = Integer.parseInt(intString);     // может быть NumberFormatException
            System.out.println("Результат 2 / " + i + " = " + (2 / i)); // может быть ArithmeticException
        }
        catch (NumberFormatException e) {
            System.out.println("Введено нецелое число");
        }
        catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
    }

    public static void main(String[] args) {
        new Exception2().exceptionDemo();
    }
}
