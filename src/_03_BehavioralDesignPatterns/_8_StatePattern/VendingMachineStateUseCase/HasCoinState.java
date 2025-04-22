package _03_BehavioralDesignPatterns._8_StatePattern.VendingMachineStateUseCase;

public class HasCoinState implements VendingMachineState {
    public void insertCoin() {
        System.out.println("Coin already inserted.");
    }
    public void selectProduct() {
        System.out.println("Product selected.");
    }
    public void dispense() {
        System.out.println("Dispensing product...");
    }
}
