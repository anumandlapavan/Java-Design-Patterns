package _01_CreationalDesignPatterns._3_FactoryAndAbstractFactoryPattern.FactoryPattern;

public class Client {
    public static void main(String[] args) {
        FactoryShape newFactoryShape = new FactoryShape();
        Shape circle1 =  newFactoryShape.getInstance("circle");
        Shape square1 = newFactoryShape.getInstance("square");

        if (circle1 instanceof Circle) {
            Circle circle = (Circle) circle1;
            System.out.println("Radius of Circle: " + circle.getRadius());
            System.out.println("Area of Circle: " + circle.getArea());
        } else {
            System.out.println("The shape is not a Circle.");
        }

        System.out.println(square1.getArea());
        System.out.println(circle1.getArea());

    }
}
