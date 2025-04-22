package _03_BehavioralDesignPatterns._8_StatePattern.VendingMachineStateUseCase;

public class VendingMachineContext {
    private VendingMachineState state;

    public VendingMachineContext() {
        state = new NoCoinState(); // default state
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void insertCoin() {
        state.insertCoin();
        setState(new HasCoinState());
    }

    public void selectProduct() {
        state.selectProduct();
    }

    public void dispense() {
        state.dispense();
        setState(new NoCoinState()); // back to default
    }
}
