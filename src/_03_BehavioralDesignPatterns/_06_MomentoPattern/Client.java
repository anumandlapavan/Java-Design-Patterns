package _03_BehavioralDesignPatterns._06_MomentoPattern;

public class Client {
    public static void main(String[] args) {
        ConfigurationCareTaker careTakerObject = new ConfigurationCareTaker();
        ConfigurationOriginator originator = new ConfigurationOriginator(10,10);

        ConfigurationMemento snapshot1 = originator.createMomento();
        careTakerObject.addMomento(snapshot1);

        originator.setHeight(7);
        originator.setWeight(12);

        ConfigurationMemento snapshot2 = originator.createMomento();
        careTakerObject.addMomento(snapshot2);

        originator.setHeight(9);
        originator.setWeight(14);

        ConfigurationMemento restoredStateMementoObj = careTakerObject.undo();
        originator.returnMomento(restoredStateMementoObj);

        // Print the restored state
        System.out.println("Height: " + originator.height + " Weight: " + originator.weight);


    }
}
