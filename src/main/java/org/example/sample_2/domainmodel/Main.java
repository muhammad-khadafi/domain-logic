package org.example.sample_2.domainmodel;

/**
 * @author muhammad.khadafi
 */
public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "John Doe");

        CustomerService customerService = new CustomerService();
        customerService.addCustomer(customer1);
        customerService.updateCustomer(new Customer(1, "John Smith"));
        customerService.placeOrder(1, "Shoes");
        customerService.deleteCustomer(1);
    }
}
