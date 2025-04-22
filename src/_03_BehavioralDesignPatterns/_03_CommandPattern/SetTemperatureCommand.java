package _03_BehavioralDesignPatterns._03_CommandPattern;

public class SetTemperatureCommand implements ICommand{

    AirConditioner__Receiver ac;
    int new_temperature;
    int previous_temperature;

    SetTemperatureCommand(AirConditioner__Receiver ac, int new_temperature){
        this.ac = ac;
        this.new_temperature = new_temperature;
    }
    @Override
    public void execute() {
        previous_temperature = ac.getTemperature();
        ac.setTemperature(new_temperature);
        System.out.println("AC set to temperature "+new_temperature);
    }

    @Override
    public void undo() {
        ac.setTemperature(previous_temperature);
        System.out.println("AC set to temperature "+previous_temperature);
    }

    @Override
    public void redo() {
        ac.setTemperature(new_temperature);
        System.out.println("AC set to temperature "+new_temperature);
    }
}
