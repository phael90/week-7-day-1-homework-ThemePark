package Attractions;

import Interfaces.ISecurity;
import Interfaces.ITicketed;
import Visitors.Visitor;

public class Rollercoster extends Attraction implements ISecurity {

    public Rollercoster(String name){
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 12 && visitor.getHeight() >= 145){
            return true;
        } else {
            return false;
        }
    }

}
