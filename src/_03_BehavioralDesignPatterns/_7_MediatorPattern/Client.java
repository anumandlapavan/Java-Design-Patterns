package _03_BehavioralDesignPatterns._7_MediatorPattern;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new AuctionMediator();
        Bidder bidder1 = new AuctionBidder("Bidder1",mediator);
        Bidder bidder2 = new AuctionBidder("Bidder2",mediator);

        mediator.addBidder(bidder1);
        mediator.addBidder(bidder2);

        bidder1.addBid(1000);
        bidder2.addBid(2000);
        bidder1.addBid(3000);

    }
}
