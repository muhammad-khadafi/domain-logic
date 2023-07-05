package org.example.sample_2.domainmodel;

/**
 * @author muhammad.khadafi
 */
class CustomerService {
    public void addCustomer(Customer customer) {
        // Business logic to add a new customer
        System.out.println("Customer added successfully!");
    }

    public void updateCustomer(Customer customer) {
        // Business logic to update customer information
        System.out.println("Customer updated successfully!");
    }

    public void deleteCustomer(int customerId) {
        // Business logic to delete a customer
        System.out.println("Customer deleted successfully!");
    }

    public void placeOrder(int customerId, String product) {
        // Fetch customer from the database or any other data source
        Customer customer = new Customer(customerId, "John Doe");

        // Business logic to place an order for the customer

    }
}
