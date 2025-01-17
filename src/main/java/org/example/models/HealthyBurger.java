package org.example.models;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    // Constructor that sets Tofu as default meat type
    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    // Add healthy additions methods
    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        // Start with the base price from the superclass
        double totalPrice = super.itemizeHamburger();

        // Add healthy extras to the price
        if (this.healthyExtra1Name != null) {
            System.out.println("HealthyAddition1: " + this.healthyExtra1Name);
            totalPrice += this.healthyExtra1Price;
        }

        if (this.healthyExtra2Name != null) {
            System.out.println("HealthyAddition2: " + this.healthyExtra2Name);
            totalPrice += this.healthyExtra2Price;
        }

        System.out.println("Price: " + totalPrice);
        return totalPrice; // Return the total price with additions
    }
}
