package _03_BehavioralDesignPatterns._08_StatePattern.DocumentStateUseCase;

public class PublishState implements DocumentState{

    @Override
    public void publish(DocumentContextClass doc) {
        System.out.println("The Document is finally published");
    }
}
