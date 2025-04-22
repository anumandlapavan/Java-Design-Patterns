package _03_BehavioralDesignPatterns._05_ObserverPattern;


public class Client {
    public static void main(String[] args) {
        StockObservable observable = new IphoneStockObservableImpl();

        NotificationObserver observer1 = new EmailNotificationObserverImpl("abc@gmail.com",observable);
        NotificationObserver observer2 = new EmailNotificationObserverImpl("xyz@gmail.com",observable);
        NotificationObserver observer3 = new EmailNotificationObserverImpl("rst@gmail.com",observable);

        observable.add(observer1);
        observable.add(observer2);
        observable.add(observer3);

        observable.setStockCount(10);

    }
}
