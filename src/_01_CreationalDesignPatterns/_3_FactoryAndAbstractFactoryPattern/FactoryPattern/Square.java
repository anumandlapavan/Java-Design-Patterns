package _01_CreationalDesignPatterns._3_FactoryAndAbstractFactoryPattern.FactoryPattern;

class Square implements Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}
