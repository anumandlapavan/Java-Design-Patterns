package _03_BehavioralDesignPatterns._01_ChainOfResponsibility;

public abstract class Handler {
    Handler nextHandler;
    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    public abstract void handle(int level);
}
