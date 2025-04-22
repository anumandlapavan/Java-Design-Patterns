package _02_StructuralDesignPatterns._7_FlyWeightPattern;

public class Client {
    public static void main(String[] args) {
        IRobot humanoidRobot1 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot1.display(1, 2);

        IRobot humanoidRobot2 = RoboticFactory.createRobot("HUMANOID");
        humanoidRobot2.display(3, 4);

        IRobot roboticDog1 = RoboticFactory.createRobot("ROBOTICDOG");
        roboticDog1.display(5, 6);

        IRobot roboticDog2 = RoboticFactory.createRobot("ROBOTICDOG");
        roboticDog2.display(7, 8);
    }
}
