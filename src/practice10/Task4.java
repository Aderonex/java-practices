package practice10;

import javax.swing.*;
import java.awt.*;

public class Task4 {

    private static double num1 = 0;
    private static String op = "";
    private static boolean reset = false;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Калькулятор кнопки");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField field = new JTextField();
        field.setEditable(false);
        field.setHorizontalAlignment(JTextField.RIGHT);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "=", "C", "+"
        };

        for (String b : buttons) {
            JButton btn = new JButton(b);
            btn.addActionListener(e -> {
                String text = e.getActionCommand();

                if (text.matches("\\d")) {
                    if (reset) {
                        field.setText("");
                        reset = false;
                    }
                    field.setText(field.getText() + text);
                } else if (text.equals("C")) {
                    field.setText("");
                    num1 = 0;
                    op = "";
                } else if (text.equals("=")) {
                    try {
                        double num2 = Double.parseDouble(field.getText());
                        double res = switch (op) {
                            case "+" -> num1 + num2;
                            case "-" -> num1 - num2;
                            case "*" -> num1 * num2;
                            case "/" -> num2 != 0 ? num1 / num2 : Double.NaN;
                            default -> num2;
                        };
                        field.setText(String.valueOf(res));
                        reset = true;
                    } catch (Exception ignore) {
                    }
                } else {
                    try {
                        num1 = Double.parseDouble(field.getText());
                        op = text;
                        reset = true;
                    } catch (Exception ignore) {
                    }
                }
            });
            panel.add(btn);
        }

        frame.add(field, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
