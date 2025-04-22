package _03_BehavioralDesignPatterns._5_ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservableImpl implements StockObservable{

    private List<NotificationObserver> observerList = new ArrayList<>();
    private int stocks = 0;
    @Override
    public void add(NotificationObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stocks == 0){
            notifySubscribers();
        }
        stocks += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stocks;
    }

    @Override
    public void notifySubscribers() {
        for(NotificationObserver observer : observerList){
            observer.update();
        }
    }
}
