package Attractions;

import Interfaces.ISecurity;
import Interfaces.ITicketed;
import Visitors.Visitor;

public class Rollercoster extends Attraction implements ISecurity {

    public Rollercoster(String name) {
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 12 && visitor.getHeight() >= 145) {
            return true;
        } else {
            return false;
        }
    }

    public double defaultPrice() {
        return 8.40;
    }

    public double priceFor(Visitor visitor){
        double price = defaultPrice();
        if (visitor.getHeight() >= 200){
            price *= 2;
        } else {
            price = price;
        }
        return price;
    }

}
