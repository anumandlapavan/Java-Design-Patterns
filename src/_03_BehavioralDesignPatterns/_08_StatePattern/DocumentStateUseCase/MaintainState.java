package _03_BehavioralDesignPatterns._08_StatePattern.DocumentStateUseCase;

public class MaintainState implements DocumentState{
    @Override
    public void publish(DocumentContextClass doc) {
        System.out.println("The Document is published in maintain state and moving to publishing state");
        doc.setDs(new PublishState());
    }
}
