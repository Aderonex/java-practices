package practice09;

public class TestCircleWithStaticMembers {

    public static void main(String[] args) {

        System.out.println("До создания объектов");
        System.out.println("Кол-во объектов типа Circle = " +
                Circle.numberOfObjects);

        // создать c1
        Circle c1 = new Circle();

        System.out.println("\nПосле создания c1");
        System.out.println("c1: радиус = " + c1.radius +
                ", количество объектов = " + Circle.numberOfObjects);

        // создать c2
        Circle c2 = new Circle(5);

        // изменить c1
        c1.radius = 9;

        System.out.println("\nПосле создания c2 и изменения c1");
        System.out.println("c1: радиус = " + c1.radius +
                ", количество объектов = " + Circle.numberOfObjects);
        System.out.println("c2: радиус = " + c2.radius +
                ", количество объектов = " + Circle.numberOfObjects);
    }
}
