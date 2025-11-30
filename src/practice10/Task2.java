package practice10;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Task2 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Страны");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        HashMap<String, String> info = new HashMap<>();
        info.put("Россия", "Россия-самая большая страна в мире.");
        info.put("Франция", "Франция-страна искусства и вина.");
        info.put("Япония", "Япония -высокие технологии и культура.");
        info.put("Италия", "Италия-паста, стиль и архитектура.");

        JComboBox<String> box = new JComboBox<>(info.keySet().toArray(new String[0]));
        JLabel label = new JLabel("Выберите страну.");

        frame.add(box);
        frame.add(label);

        box.addActionListener(e ->
                label.setText(info.get((String) box.getSelectedItem()))
        );

        frame.setVisible(true);
    }
}
