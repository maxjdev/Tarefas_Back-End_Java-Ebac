package edu.java.abstractfactory.bike_category;
import edu.java.abstractfactory.abstracts.Bike;
import edu.java.abstractfactory.abstracts.Factory;
import edu.java.abstractfactory.bikes.R1250gs;
public class OffRoad extends Factory {
    /**
     * @param requested 
     * @return
     */
    @Override
    public Bike retrieveBike(String requested) {
        if ("offroad".equalsIgnoreCase(requested)) {
            return new R1250gs("Azul");
        }
        return null;
    }
}
