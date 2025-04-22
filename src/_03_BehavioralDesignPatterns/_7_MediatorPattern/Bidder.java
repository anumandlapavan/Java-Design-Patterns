package _03_BehavioralDesignPatterns._7_MediatorPattern;

interface Bidder {
    public void addBid(int bidAmount);

    public void receiveNotification(int bidAmount);

    public String getName();
}
