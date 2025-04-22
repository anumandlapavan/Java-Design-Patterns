package _02_StructuralDesignPatterns._2_BridgePattern;

public class Client {
    public static void main(String[] args) {
        AbstractBridge dog = new DogBridge(new LandBreatheImplementor());
        AbstractBridge fish = new FishBridge(new WaterBreatheImplementor());

        dog.breatheProcess();
        fish.breatheProcess();
    }
}

