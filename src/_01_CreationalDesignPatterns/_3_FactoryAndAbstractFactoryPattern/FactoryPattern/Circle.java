package _01_CreationalDesignPatterns._3_FactoryAndAbstractFactoryPattern.FactoryPattern;

class Circle implements Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }

    public int getRadius() {
        return radius;
    }
}
