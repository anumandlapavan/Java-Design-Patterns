package _01_CreationalDesignPatterns._3_FactoryAndAbstractFactoryPattern.FactoryPattern;

class Rectangle implements Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }
}
