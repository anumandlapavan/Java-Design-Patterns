package _02_StructuralDesignPatterns._2_BridgePattern;

public class TreeBreatheImplementor implements BreatheImplementor{
    @Override
    public void breathe() {
        System.out.println("Breathe through LEAVES\nInhale carbon dioxide\nExhale oxygen through photosynthesis");
    }
}
