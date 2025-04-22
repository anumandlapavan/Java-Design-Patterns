package _03_BehavioralDesignPatterns._3_CommandPattern;

public class TurnOnCommand implements ICommand{
    AirConditioner__Receiver ac;
    TurnOnCommand(AirConditioner__Receiver ac){
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.turnOn();
    }

    @Override
    public void undo() {
        ac.turnOff();
    }

    @Override
    public void redo() {
        ac.turnOn();
    }
}
