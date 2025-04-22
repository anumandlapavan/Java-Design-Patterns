package _03_BehavioralDesignPatterns._08_StatePattern.DocumentStateUseCase;

public class DocumentContextClass {
    DocumentState ds;

    DocumentContextClass(){
        this.ds = new DraftState();
    }

    public void setDs(DocumentState ds){
        this.ds = ds;
    }

    public void publish(){
        this.ds.publish(this);
    }
}
