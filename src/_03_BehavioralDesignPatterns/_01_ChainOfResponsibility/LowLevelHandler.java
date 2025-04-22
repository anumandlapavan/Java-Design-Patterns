package _03_BehavioralDesignPatterns._01_ChainOfResponsibility;

public class LowLevelHandler extends Handler {
    @Override
    public void handle(int level) {
        if(level == 1){
            System.out.println("The request is handled at LowLevelHandler");
        }
        else if(this.nextHandler != null){
            nextHandler.handle(level);
        }
        else{
            System.out.println("Request cannot be handled.");
        }
    }
}
