package _03_BehavioralDesignPatterns._1_ChainOfResponsibility;

public class RequestProcess {
    Handler low = new LowLevelHandler();
    Handler high = new HighLevelHandler();

    Handler mid = new MidLevelHandler();
    Handler chain;

    RequestProcess (){
        low.setNextHandler(mid);
        mid.setNextHandler(high);

        chain = low;
    }

    public void processRequest(int level){
        chain.handle(level);
    }

}
