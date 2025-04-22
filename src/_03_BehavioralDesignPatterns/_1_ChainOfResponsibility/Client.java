package _03_BehavioralDesignPatterns._1_ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        RequestProcess processor = new RequestProcess();
        processor.processRequest(4);
    }
}
