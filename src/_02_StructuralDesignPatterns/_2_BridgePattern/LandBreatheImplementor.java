package _02_StructuralDesignPatterns._2_BridgePattern;

public class LandBreatheImplementor implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Breath through NOSE\nInhale oxygen from air\nExhale carbon dioxide");
    }
}
