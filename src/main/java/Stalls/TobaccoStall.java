package Stalls;

import Visitors.Visitor;

public class TobaccoStall  extends Stall{
    public TobaccoStall(String name, String ownerName, int parkingSpot){
        super(name, ownerName, parkingSpot);
    }
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() <= 18) {
            return true;
        } else {
            return false;
        }
    }

}
