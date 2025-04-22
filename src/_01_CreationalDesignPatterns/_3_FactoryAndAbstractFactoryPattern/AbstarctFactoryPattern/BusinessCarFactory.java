package _01_CreationalDesignPatterns._3_FactoryAndAbstractFactoryPattern.AbstarctFactoryPattern;

class BusinessCarFactory implements AbstractFactory {
    @Override
    public Car getInstance(int price) {
        if (price >= 100000 && price < 150000) {
            return new BussinessCar1();
        }
        if (500000 < price && price <= 100000) {
            return new BussinessCar2();
        }
        return null;
    }
}
