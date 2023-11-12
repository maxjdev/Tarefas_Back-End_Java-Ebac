package edu.java.abstractfactory.abstracts;
public abstract class Factory {
    public Bike create (String requested) {
        Bike bike = retrieveBike(requested);
        completeTank(bike);
        return bike;
    }
    public void completeTank (Bike bike) {
        Integer gasoline = 100;
        bike.fuel(gasoline);
    }
    public abstract Bike retrieveBike(String requested);
}
