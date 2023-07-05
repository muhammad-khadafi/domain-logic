package org.example.sample_1.domainmodel;

/**
 * @author muhammad.khadafi
 */
class Customer {
    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters

    public void placeOrder(String product) {
        // Logic for placing an order
        System.out.println("Order placed by " + name + " for product: " + product);
    }
}
