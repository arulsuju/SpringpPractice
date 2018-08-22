package org.example.demo1;

public class Cricket implements Coach {

    private BestOffer bestOffer;


    public Cricket(BestOffer bestOffer) {
        this.bestOffer = bestOffer;
    }

    public void setBestOffer(BestOffer bestOffer) {
        this.bestOffer = bestOffer;
    }

    @Override
    public String getPractiseInfo() {
        return "First Practise on Nets";
    }

    @Override
    public String getOffer() {
        return bestOffer.offerMessage();
    }
}
