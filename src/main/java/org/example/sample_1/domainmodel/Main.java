package org.example.sample_1.domainmodel;

/**
 * @author muhammad.khadafi
 */
public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(1, "John Doe");
        customer.placeOrder("Shoes");
    }

}
