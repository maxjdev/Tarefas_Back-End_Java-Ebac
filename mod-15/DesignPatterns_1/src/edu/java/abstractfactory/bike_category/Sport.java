package edu.java.abstractfactory.bike_category;
import edu.java.abstractfactory.abstracts.Bike;
import edu.java.abstractfactory.abstracts.Factory;
import edu.java.abstractfactory.bikes.S1000rr;
public class Sport extends Factory {
    /**
     * @param requested 
     * @return
     */
    @Override
    public Bike retrieveBike(String requested) {
        if ("Sport".equalsIgnoreCase(requested)) {
            return new S1000rr("Vermelha");
        }
        return null;
    }
}
