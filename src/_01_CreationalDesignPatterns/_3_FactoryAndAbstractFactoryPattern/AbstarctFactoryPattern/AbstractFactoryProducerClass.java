package _01_CreationalDesignPatterns._3_FactoryAndAbstractFactoryPattern.AbstarctFactoryPattern;

public class AbstractFactoryProducerClass {
    public static AbstractFactory getFactory(String type) {
        if ("Luxury".equalsIgnoreCase(type)) {
            return new LuxuryCarFactory();
        } else if ("Business".equalsIgnoreCase(type)) {
            return new BusinessCarFactory();
        }
        return null;
    }

    public static void main(String[] args) {
        AbstractFactory luxuryFactory = AbstractFactoryProducerClass.getFactory("Luxury");
        if (luxuryFactory != null) {
            Car luxuryCar = luxuryFactory.getInstance(200000);
            if (luxuryCar != null) {
                System.out.println("Luxury Car Top Speed: " + luxuryCar.getTopSpeed() + " km/h");
            } else {
                System.out.println("No luxury car available for the given price.");
            }
        }

        AbstractFactory businessFactory = AbstractFactoryProducerClass.getFactory("Business");
        if (businessFactory != null) {
            Car businessCar = businessFactory.getInstance(100000);
            if (businessCar != null) {
                System.out.println("Business Car Top Speed: " + businessCar.getTopSpeed() + " km/h");
            } else {
                System.out.println("No business car available for the given price.");
            }
        }
    }
}













