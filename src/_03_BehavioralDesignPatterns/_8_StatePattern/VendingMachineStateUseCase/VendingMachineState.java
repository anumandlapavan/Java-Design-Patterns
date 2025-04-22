package _03_BehavioralDesignPatterns._8_StatePattern.VendingMachineStateUseCase;

public interface VendingMachineState {
    void insertCoin();
    void selectProduct();
    void dispense();
}

