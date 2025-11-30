package practice05;

public class Main {
    public static void main(String[] args) {

        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println("Исходная точка: " + point);
        point.moveUp();
        point.moveRight();
        System.out.println("После движения точки: " + point);

        MovableCircle circle = new MovableCircle(5, 5, 1, 1, 10);
        System.out.println("Исходный круг: " + circle);
        circle.moveDown();
        circle.moveLeft();
        System.out.println("После движения круга: " + circle);
    }
}
