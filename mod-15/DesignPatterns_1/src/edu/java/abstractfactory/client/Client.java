package edu.java.abstractfactory.client;
public class Client {
    private final String requested;
    public Client(String requested) {
        this.requested = requested;
    }
    public String getRequested() {
        return requested;
    }
}
