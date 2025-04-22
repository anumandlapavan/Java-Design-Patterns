package _03_BehavioralDesignPatterns._8_StatePattern.VendingMachineStateUseCase;

public class Client {
    public static void main(String[] args) {
        VendingMachineContext vm = new VendingMachineContext();

        vm.selectProduct();
        vm.insertCoin();
        vm.selectProduct();
        vm.dispense();
    }
}

