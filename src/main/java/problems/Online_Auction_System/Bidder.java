package problems.Online_Auction_System;

public class Bidder implements Colleague{
    String name;
    Mediator auctionMediator;

    public Bidder(String name,Mediator auctionMediator){
        this.name = name;
        this.auctionMediator = auctionMediator;
        this.auctionMediator.addBidder(this);
    }
    @Override
    public void placeBid(int bidAmount) {
        auctionMediator.placeBid(this,bidAmount);
    }

    @Override
    public void receiveBidNotification(int bidAmount) {
        System.out.println("Bidder "+name+" got the notification that someone has put a bid of amount "+ bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}
