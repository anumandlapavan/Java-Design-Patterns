package _03_BehavioralDesignPatterns._3_CommandPattern;

public class TurnOffCommand implements ICommand{
    AirConditioner__Receiver ac;
    TurnOffCommand(AirConditioner__Receiver ac){
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.turnOff();
    }

    @Override
    public void undo() {
        ac.turnOn();
    }

    @Override
    public void redo() {
        ac.turnOff();
    }
}
