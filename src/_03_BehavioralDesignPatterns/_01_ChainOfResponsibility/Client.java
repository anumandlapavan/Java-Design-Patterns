package _03_BehavioralDesignPatterns._01_ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        RequestProcess processor = new RequestProcess();
        processor.processRequest(4);
    }
}
