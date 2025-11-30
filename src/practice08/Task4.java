package practice08;

import javax.swing.*;
import java.awt.*;

public class Task4 extends JPanel {

    private static final String IMG_PATH = "src/practice08/jaavaa.png";

    private final ImageIcon icon;
    private int x = 0;
    private int y = 200;
    private int dx = 4; // скорость по оси X

    public Task4() {
        icon = new ImageIcon(IMG_PATH);

        Timer timer = new Timer(30, e -> {
            x += dx;
            if (x < 0 || x + icon.getIconWidth() > getWidth()) {
                dx = -dx; // отскок от границы окна
            }
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        icon.paintIcon(this, g, x, y);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Анимация изображения");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);

        frame.add(new Task4());

        frame.setVisible(true);
    }
}
