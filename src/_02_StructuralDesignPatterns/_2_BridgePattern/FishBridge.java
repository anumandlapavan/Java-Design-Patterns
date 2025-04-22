package _02_StructuralDesignPatterns._2_BridgePattern;

public class FishBridge extends AbstractBridge{
    FishBridge(WaterBreatheImplementor waterBreatheImplementor){
        super(waterBreatheImplementor);
    }
    @Override
    public void breatheProcess() {
        System.out.print("Fish: ");
        bi.breathe();
    }
}
