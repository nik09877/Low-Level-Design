package problems.Online_Auction_System;

import java.util.ArrayList;
import java.util.List;

public class AuctionMediator implements Mediator{

    List<Colleague> colleagues = new ArrayList<>();


    @Override
    public void addBidder(Colleague bidder) {
        colleagues.add(bidder);
    }

    @Override
    public void placeBid(Colleague bidder, int bidAmount) {
        for(Colleague colleague:colleagues){
            if(!colleague.getName().equalsIgnoreCase(bidder.getName()))
                colleague.receiveBidNotification(bidAmount);
        }
    }
}
