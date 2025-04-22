package _03_BehavioralDesignPatterns._09_StrategyPattern;

public class Client {
    public static void main(String[] args) {
        ShoppingCartContext sc = new ShoppingCartContext();

        sc.setPaymentSelection(new PaypalPayment("anu@gmail.com"));
        sc.checkOut(500);

        sc.setPaymentSelection(new CreditCardPayment("4444 4444 4444"));
        sc.checkOut(1000);
    }
}
