package _03_BehavioralDesignPatterns._3_CommandPattern;

public class AirConditioner__Receiver {
    private boolean isOn;
    private int temperature;

    public void turnOn(){
        this.isOn = true;
        System.out.println("AC is turned on");
    }

    public void turnOff(){
        this.isOn = false;
        System.out.println("AC is turned off");
    }

    public void setTemperature( int temperature){
        this.temperature = temperature;
    }

    public int getTemperature(){
        return this.temperature;
    }

    public boolean isOn(){
        return this.isOn;
    }

}
