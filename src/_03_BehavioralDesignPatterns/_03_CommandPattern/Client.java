package _03_BehavioralDesignPatterns._03_CommandPattern;

public class Client {
    public static void main(String[] args) {
        AirConditioner__Receiver airConditioner = new AirConditioner__Receiver();
        MyRemoteControl__Invoker remoteControl = new MyRemoteControl__Invoker();

        ICommand turnOnCommand = new TurnOnCommand(airConditioner);
        remoteControl.setCommand(turnOnCommand);
        remoteControl.pressButton();

        ICommand turnOffCommand = new TurnOffCommand(airConditioner);
        remoteControl.setCommand(turnOffCommand);
        remoteControl.pressButton();

        ICommand setTempCommand = new SetTemperatureCommand(airConditioner, 22);
        remoteControl.setCommand(setTempCommand);
        remoteControl.pressButton();

        remoteControl.undo();
        remoteControl.undo();
        remoteControl.redo();
    }
}
