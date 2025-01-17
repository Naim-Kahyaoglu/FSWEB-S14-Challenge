package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double basePrice; // Base price for the hamburger
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    // New field to store the total price
    private double price;

    public Hamburger(String name, String meat, double basePrice, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.basePrice = basePrice;
        this.breadRollType = breadRollType;
        this.price = basePrice;  // Initialize with base price
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
        this.price += price;  // Update price when addition is made
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
        this.price += price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
        this.price += price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
        this.price += price;
    }

    // Update the itemizeHamburger method to return the current total price
    public double itemizeHamburger() {
        double totalPrice = this.price;  // Use the updated price field
        System.out.println("Name: " + this.name);
        System.out.println("Meat: " + this.meat);
        System.out.println("BreadRollType: " + this.breadRollType);

        if (this.addition1Name != null) {
            System.out.println("Addition1: " + this.addition1Name);
            totalPrice += this.addition1Price;
        }

        if (this.addition2Name != null) {
            System.out.println("Addition2: " + this.addition2Name);
            totalPrice += this.addition2Price;
        }

        if (this.addition3Name != null) {
            System.out.println("Addition3: " + this.addition3Name);
            totalPrice += this.addition3Price;
        }

        if (this.addition4Name != null) {
            System.out.println("Addition4: " + this.addition4Name);
            totalPrice += this.addition4Price;
        }

        System.out.println("Price: " + totalPrice);
        return totalPrice;
    }

    // Getters for fields (optional but useful for validation)
    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    // Add a getPrice() method to return the total price
    public double getPrice() {
        return price;  // Simply return the dynamically updated price
    }

    // Add a getBasePrice() method for testing purposes
    public double getBasePriceForTest() {
        return basePrice;  // Returns the base price without additions
    }
}
