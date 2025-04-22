package _02_StructuralDesignPatterns._1_AdapterPattern;

public class Client {
    public static void main(String[] args) {
        WeightMachineAdaptorImplementation weightMachine = new WeightMachineAdaptorImplementation(new WeightMachineForBabies());
        double weight = weightMachine.getWeightInKg();
        System.out.println(weight);
    }
}
