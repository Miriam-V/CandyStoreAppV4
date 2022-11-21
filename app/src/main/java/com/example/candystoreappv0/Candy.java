package com.example.candystoreappv0;

public class Candy {

    private int id;
    private String name;
    private double price;

    public Candy (int newID, String newName, double newPrice) {

        setID(newID);
        setName(newName);
        setPrice(newPrice);

    }

    private void setPrice(double newPrice) {
        if (newPrice >= 0.0)
            price = newPrice;
    }

    private void setName(String newName) {
        name = newName;
    }

    private void setID(int newId) {
        id = newId;
    }

    public int getId( ) { return id; }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return id + "; " + name + ": " + price;
    }


}
