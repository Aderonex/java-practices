package practice12;

import java.util.Scanner;

public class Exception4 {

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
        finally {
            System.out.println("Выполняется в любом случае");
        }
    }

    public static void main(String[] args) {
        new Exception4().exceptionDemo();
    }
}
