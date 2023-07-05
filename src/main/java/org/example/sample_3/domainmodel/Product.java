package org.example.sample_3.domainmodel;

/**
 * @author muhammad.khadafi
 */
public class Product {
    private int id;
    private String name;
    private double price;

    // Konstruktor, getter, dan setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    // Metode lain yang terkait dengan bisnis produk
}
