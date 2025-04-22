package _01_CreationalDesignPatterns._3_FactoryAndAbstractFactoryPattern.AbstarctFactoryPattern;

class LuxuryCarFactory implements AbstractFactory {
    @Override
    public Car getInstance(int price) {
        if (price >= 200000) {
            return new LuxuryCar1();
        }
        if (150000 < price && price <= 200000) {
            return new LuxuryCar2();
        }
        return null;
    }
}
