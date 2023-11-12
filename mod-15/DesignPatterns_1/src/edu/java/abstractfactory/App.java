package edu.java.abstractfactory;
import edu.java.abstractfactory.abstracts.Bike;
import edu.java.abstractfactory.abstracts.Factory;
import edu.java.abstractfactory.bike_category.OffRoad;
import edu.java.abstractfactory.bike_category.Sport;
import edu.java.abstractfactory.client.Client;
public class App {
    public static void main(String[] args) {
        Client client = new Client("sport");
        Factory factory = sportOrOffRoad(client);
        Bike bike = factory.create(client.getRequested());
        bike.start();
        System.out.println("Bike= " + bike);
    }
    private static Factory sportOrOffRoad (Client client) {
        if (client.getRequested().equalsIgnoreCase("offroad")) {
            return new OffRoad();
        } else if (client.getRequested().equalsIgnoreCase("sport")) {
            return new Sport();
        } else {
            return null;
        }
    }
}
