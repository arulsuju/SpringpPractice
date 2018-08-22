package org.example.demo1;

public class FootBall implements Coach {

    private BestOffer bestOffer;

    public FootBall(BestOffer bestOffer) {
        this.bestOffer = bestOffer;
    }

    public void setBestOffer(BestOffer bestOffer) {
        this.bestOffer = bestOffer;
    }

    @Override
    public String getPractiseInfo() {
        return "Warmup before Practise";
    }

    @Override
    public String getOffer() {
        return bestOffer.offerMessage();
    }
}
