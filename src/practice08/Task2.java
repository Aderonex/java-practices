
package practice08;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Task2 extends JPanel {

    private final Shape[] shapes;

    public Task2() {
        Random rnd = new Random();
        shapes = new Shape[20];

        for (int i = 0; i < shapes.length; i++) {
            int type = rnd.nextInt(3);
            Color color = new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            int x = rnd.nextInt(400);
            int y = rnd.nextInt(400);

            switch (type) {
                case 0 -> shapes[i] = new Circle(color, x, y, rnd.nextInt(60) + 20);
                case 1 -> shapes[i] = new Rectangle(color, x, y,
                        rnd.nextInt(80) + 20, rnd.nextInt(80) + 20);
                case 2 -> shapes[i] = new Square(color, x, y, rnd.nextInt(80) + 20);
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape s : shapes) {
            s.draw(g);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Случайные фигуры");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        frame.add(new Task2());

        frame.setVisible(true);
    }
}
