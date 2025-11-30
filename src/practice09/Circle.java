package practice09;

public class Circle {

    /** Радиус круга */
    double radius;

    /** Количество созданных объектов */
    static int numberOfObjects = 0;

    /** Создаёт круг с радиусом 1 */
    public Circle() {
        radius = 1.0;
        numberOfObjects++;
    }

    /** Создаёт круг с указанным радиусом */
    public Circle(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    /** Возвращает радиус */
    public double getRadius() {
        return radius;
    }

    /** Устанавливает радиус */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Возвращает количество созданных кругов */
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /** Возвращает площадь круга */
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
