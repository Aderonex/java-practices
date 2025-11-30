package practice10;

import javax.swing.*;
import java.awt.*;

public class Task3 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Меню");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar bar = new JMenuBar();

        JMenu file = new JMenu("Файл");
        JMenu edit = new JMenu("Правка");
        JMenu help = new JMenu("Справка");

        JMenuItem exit = new JMenuItem("Выход");
        JMenuItem copy = new JMenuItem("Копировать");
        JMenuItem paste = new JMenuItem("Вставить");
        JMenuItem about = new JMenuItem("О программе");

        file.add(exit);
        edit.add(copy);
        edit.add(paste);
        help.add(about);

        bar.add(file);
        bar.add(edit);
        bar.add(help);

        JTextArea area = new JTextArea();
        JButton clear = new JButton("Очистить");
        JButton hello = new JButton("Привет!");

        JPanel panel = new JPanel();
        panel.add(clear);
        panel.add(hello);

        frame.add(bar, BorderLayout.NORTH);
        frame.add(new JScrollPane(area), BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);

        clear.addActionListener(e -> area.setText(""));

        hello.addActionListener(e -> area.append("Привет!\n"));

        exit.addActionListener(e -> System.exit(0));

        about.addActionListener(e -> JOptionPane.showMessageDialog(frame,
                "Демонстрация меню",
                "О программе",
                JOptionPane.INFORMATION_MESSAGE));

        frame.setVisible(true);
    }
}
