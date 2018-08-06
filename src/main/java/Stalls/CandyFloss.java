package Stalls;

public class CandyFloss extends Stall {
    public CandyFloss(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public double defaultPrice() {
        return 4.20;
    }
}
