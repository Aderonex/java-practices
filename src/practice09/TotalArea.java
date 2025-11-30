package practice09;

public class TotalArea {

    public static void main(String[] args) {
        Circle[] circleArray = createCircleArray();
        printCircleArray(circleArray);
    }

    /** Создаёт массив кругов со случайными радиусами */
    public static Circle[] createCircleArray() {
        Circle[] circleArray = new Circle[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle(Math.random() * 100);
        }

        return circleArray;
    }

    /** Печатает радиусы, площади и общую площадь */
    public static void printCircleArray(Circle[] circleArray) {
        System.out.println("Радиус\t\tПлощадь");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.println(circleArray[i].getRadius() + "\t" +
                    circleArray[i].getArea());
        }

        System.out.println("Общая площадь = " + sum(circleArray));
    }

    /** Сумма площадей всех кругов */
    public static double sum(Circle[] circleArray) {
        double sum = 0;
        for (int i = 0; i < circleArray.length; i++) {
            sum += circleArray[i].getArea();
        }
        return sum;
    }
}
