package _03_BehavioralDesignPatterns._9_StrategyPattern;

public class ShoppingCartContext {
    PaymentSelection ps;

    ShoppingCartContext(){}

    public void setPaymentSelection(PaymentSelection ps){
        this.ps = ps;
    }

    public void checkOut(int  amount){
        this.ps.pay(amount);
    }
}
