package problems.Online_Auction_System;

public interface Mediator {
    void addBidder(Colleague bidder);
    void placeBid(Colleague bidder,int bidAmount);
}
