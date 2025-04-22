package _03_BehavioralDesignPatterns._1_ChainOfResponsibility;

public abstract class Handler {
    Handler nextHandler;
    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    public abstract void handle(int level);
}
