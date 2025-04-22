package _03_BehavioralDesignPatterns._7_MediatorPattern;

public class AuctionBidder implements Bidder{
    String name;
    Mediator mediator;
    AuctionBidder(String name,Mediator mediator){
        this.name = name;
        this.mediator= mediator;
    }
    @Override
    public void addBid(int bidAmount) {
        mediator.placeBid(this,bidAmount);
    }

    @Override
    public void receiveNotification(int bidAmount) {
        System.out.println( "Bidder: " + name + " received notification that someone has placed a bid of: " + bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}
