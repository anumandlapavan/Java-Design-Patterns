package _03_BehavioralDesignPatterns._8_StatePattern.VendingMachineStateUseCase;

public class NoCoinState implements VendingMachineState {
    public void insertCoin() {
        System.out.println("Coin inserted.");
    }
    public void selectProduct() {
        System.out.println("Insert coin first.");
    }
    public void dispense() {
        System.out.println("Insert coin first.");
    }
}
