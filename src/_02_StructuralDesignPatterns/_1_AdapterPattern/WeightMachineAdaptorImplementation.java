package _02_StructuralDesignPatterns._1_AdapterPattern;

class WeightMachineAdaptorImplementation implements WeightMachineAdaptor {
    WeightMachine weightMachine;

    WeightMachineAdaptorImplementation(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    public double getWeightInKg() {
        return weightMachine.getWeightInPounds() * 0.4;
    }

}
