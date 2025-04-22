package _03_BehavioralDesignPatterns._8_StatePattern.DocumentStateUseCase;

public class DraftState implements DocumentState{
    @Override
    public void publish(DocumentContextClass doc) {
        System.out.println("The Document is published in draft state and moving to maintain state");
        doc.setDs(new MaintainState());
    }
}
