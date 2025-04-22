package _03_BehavioralDesignPatterns._01_ChainOfResponsibility;

public class MidLevelHandler extends Handler{

    @Override
    public void handle(int level) {
        if(level >1 && level < 5){
            System.out.println("The request is handled at MidLevelHandler");
        }
        else if(this.nextHandler != null){
            nextHandler.handle(level);
        }
        else{
            System.out.println("Request cannot be handled.");
        }
    }
}
