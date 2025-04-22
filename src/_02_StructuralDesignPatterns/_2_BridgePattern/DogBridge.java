package _02_StructuralDesignPatterns._2_BridgePattern;

public class DogBridge extends AbstractBridge{

    DogBridge(LandBreatheImplementor landBreatheImplementor) {
        super(landBreatheImplementor);
    }
    @Override
    public void breatheProcess() {
        System.out.print("Dog: ");
        bi.breathe();
    }
}
