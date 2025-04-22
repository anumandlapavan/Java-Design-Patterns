package _01_CreationalDesignPatterns._3_FactoryAndAbstractFactoryPattern.FactoryPattern;

class FactoryShape {
    public Shape getInstance(String value) {
        if (value.equals("circle")) {
            return new Circle(3);
        }
        if (value.equals("square")) {
            return new Square(3);
        }
        if (value.equals("rectangle")) {
            return new Rectangle(3, 2);
        }
        return null;
    }
}
