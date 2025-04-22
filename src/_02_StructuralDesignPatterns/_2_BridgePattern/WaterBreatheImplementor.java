package _02_StructuralDesignPatterns._2_BridgePattern;

public class WaterBreatheImplementor implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Breathe through GILLS\nAbsorb oxygen from water\nRelease carbon dioxide");
    }
}
