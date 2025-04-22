package _03_BehavioralDesignPatterns._08_StatePattern.DocumentStateUseCase;

public class Client {
    public static void main(String[] args) {
        DocumentContextClass ds = new DocumentContextClass();

        ds.publish();

        ds.publish();

        ds.publish();
    }
}
