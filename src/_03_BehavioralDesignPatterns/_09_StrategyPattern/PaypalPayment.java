package _03_BehavioralDesignPatterns._09_StrategyPattern;

public class PaypalPayment implements PaymentSelection{
    String mail;
    PaypalPayment(String mail){
        this.mail = mail;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Payment of amount "+ amount +" rupees is done through paypal user-"+this.mail);
    }
}
