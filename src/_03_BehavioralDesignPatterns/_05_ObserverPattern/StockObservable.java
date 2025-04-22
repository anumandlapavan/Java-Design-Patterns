package _03_BehavioralDesignPatterns._05_ObserverPattern;

interface StockObservable {
    public void add(NotificationObserver observer);

    public void remove(NotificationObserver observer);

    public void setStockCount(int newStockAdded);

    public int getStockCount();

    public void notifySubscribers();
}
