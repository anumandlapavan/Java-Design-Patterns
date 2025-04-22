package _03_BehavioralDesignPatterns._07_MediatorPattern;

interface Mediator {
    public void addBidder(Bidder bidder);

    public void placeBid(Bidder bidder, int amount);
}
