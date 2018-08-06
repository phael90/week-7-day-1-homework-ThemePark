package ThemeParks;

import Attractions.Attraction;
import Stalls.Stall;
import Visitors.Visitor;

import java.util.ArrayList;

public class ThemePark {
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(){
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }

    public String visit(Visitor visitor, Attraction attraction){
        return visitor + " visited " + attraction;
    }
}
