package _02_StructuralDesignPatterns._2_BridgePattern;

public abstract class AbstractBridge {
    BreatheImplementor bi;

    AbstractBridge(BreatheImplementor bi){
        this.bi = bi;
    }
    public abstract void breatheProcess();
}
