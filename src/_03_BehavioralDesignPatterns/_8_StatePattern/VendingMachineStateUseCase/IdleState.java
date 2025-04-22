package _03_BehavioralDesignPatterns._8_StatePattern.VendingMachineStateUseCase;

public class IdleState implements VendingMachineState{
    @Override
    public void insertCoin() {
        System.out.println("Insert a coin first.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Insert a coin first.");
    }

    @Override
    public void dispense() {
        System.out.println("Insert a coin first.");
    }
}
