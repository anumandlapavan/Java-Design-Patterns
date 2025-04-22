package _03_BehavioralDesignPatterns._05_ObserverPattern;

public class EmailNotificationObserverImpl implements NotificationObserver{

    String emailId;
    StockObservable observable;

    EmailNotificationObserverImpl(String emailId,StockObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }
    @Override
    public void update() {
        sendEmail(emailId,"Product is in stock hurry up!");
    }

    public void sendEmail(String emailId, String Message){
        System.out.println(emailId +" "+ Message);
    }
}
