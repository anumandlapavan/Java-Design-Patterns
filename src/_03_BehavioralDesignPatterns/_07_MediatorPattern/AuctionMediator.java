package _03_BehavioralDesignPatterns._07_MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Mediator{

    List<Bidder> biddersList = new ArrayList<>();
    @Override
    public void addBidder(Bidder bidder) {
        biddersList.add(bidder);
    }

    @Override
    public void placeBid(Bidder bidder, int bidAmount) {
        for(Bidder bidderI : biddersList){
            if(!bidderI.getName().equals(bidder.getName())){
                bidderI.receiveNotification(bidAmount);
            }
        }
    }
}
