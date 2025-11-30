package practice08;

import javax.swing.*;

public class Task3 {

    // относительный путь к картинке в проекте
    private static final String IMG_PATH = "src/practice08/jaavaa.png";

    public static void main(String[] args) {
        JFrame frame = new JFrame("Просмотр изображения");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        ImageIcon icon = new ImageIcon(IMG_PATH);
        JLabel label = new JLabel(icon);

        frame.add(label);
        frame.setVisible(true);
    }
}
