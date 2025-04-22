package _03_BehavioralDesignPatterns._9_StrategyPattern;

public class CreditCardPayment implements PaymentSelection{
    String cardNumber;
    CreditCardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Payment of amount "+ amount +" rupees is done through creditCard user-"+this.cardNumber);
    }
}
