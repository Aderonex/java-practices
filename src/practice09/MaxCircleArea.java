package practice09;

public class MaxCircleArea {

    public static void main(String[] args) {
        int n = 10;
        Circle[] circles = new Circle[n];

        for (int i = 0; i < n; i++) {
            circles[i] = new Circle(Math.random() * 100);
        }

        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (circles[i].getArea() > circles[maxIndex].getArea()) {
                maxIndex = i;
            }
        }

        Circle maxCircle = circles[maxIndex];

        System.out.println("Круг с максимальной площадью:");
        System.out.println("Радиус = " + maxCircle.getRadius());
        System.out.println("Площадь = " + maxCircle.getArea());
    }
}
