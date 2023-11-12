package edu.java.abstractfactory.abstracts;
public abstract class Bike {
    private Integer cylinder;
    private final String color;
    private Integer fuelSrouce = 30;
    public Bike(String color) {
        this.color = color;
    }
    public void start () {
        System.out.println("Ligando a moto... Tanque está " + fuelSrouce + "% abastecido !");
    }
    public void fuel (Integer fuelSrouce) {
        this.fuelSrouce = fuelSrouce;
    }
}
