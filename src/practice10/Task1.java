package practice10;

import javax.swing.*;
import java.awt.*;

public class Task1 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Калькулятор бим бим");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));

        JTextField num1 = new JTextField();
        JTextField num2 = new JTextField();

        String[] ops = {"+", "-", "*", "/"};
        JComboBox<String> operation = new JComboBox<>(ops);

        JButton calc = new JButton("Посчитать");
        JLabel result = new JLabel("Результат: ");

        frame.add(new JLabel("Число 1:"));
        frame.add(num1);
        frame.add(new JLabel("Число 2:"));
        frame.add(num2);
        frame.add(new JLabel("Операция:"));
        frame.add(operation);
        frame.add(calc);
        frame.add(result);

        calc.addActionListener(e -> {
            try {
                double a = Double.parseDouble(num1.getText());
                double b = Double.parseDouble(num2.getText());
                String op = (String) operation.getSelectedItem();
                double res = switch (op) {
                    case "+" -> a + b;
                    case "-" -> a - b;
                    case "*" -> a * b;
                    case "/" -> b != 0 ? a / b : Double.NaN;
                    default -> 0;
                };
                result.setText("Результат: " + res);
            } catch (Exception ex) {
                result.setText("Ошибка ввода");
            }
        });

        frame.setVisible(true);
    }
}
