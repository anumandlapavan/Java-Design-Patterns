package _03_BehavioralDesignPatterns._08_StatePattern.VendingMachineStateUseCase;

public interface VendingMachineState {
    void insertCoin();
    void selectProduct();
    void dispense();
}

