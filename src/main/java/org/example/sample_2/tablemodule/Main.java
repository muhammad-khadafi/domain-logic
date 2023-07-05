package org.example.sample_2.tablemodule;

/**
 * @author muhammad.khadafi
 */
public class Main {

    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        customerService.placeOrder(1, "Shoes");
    }

}
