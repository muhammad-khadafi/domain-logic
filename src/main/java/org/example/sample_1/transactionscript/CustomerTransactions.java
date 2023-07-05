package org.example.sample_1.transactionscript;

/**
 * @author muhammad.khadafi
 */

import java.util.HashMap;
import java.util.Map;

// Customer transactions class
public class CustomerTransactions {

    // Database to store customer data
    private static Map<Integer, String> customerData = new HashMap<>();

    // Transaction to add a customer
    public static void addCustomer(int customerId, String customerName) {
        customerData.put(customerId, customerName);
        System.out.println("Customer added successfully!");
    }

    // Transaction to place an order for a customer
    public static void placeOrder(int customerId, String product) {
        if (customerData.containsKey(customerId)) {
            String customerName = customerData.get(customerId);
            System.out.println("Order placed by " + customerName + " for product: " + product);
        } else {
            System.out.println("Customer not found!");
        }
    }

    // Transaction to update customer name
    public static void updateCustomerName(int customerId, String newCustomerName) {
        if (customerData.containsKey(customerId)) {
            customerData.put(customerId, newCustomerName);
            System.out.println("Customer name updated successfully!");
        } else {
            System.out.println("Customer not found!");
        }
    }

    // Transaction to delete a customer
    public static void deleteCustomer(int customerId) {
        if (customerData.containsKey(customerId)) {
            customerData.remove(customerId);
            System.out.println("Customer deleted successfully!");
        } else {
            System.out.println("Customer not found!");
        }
    }

    public static void main(String[] args) {
        addCustomer(1, "John Doe");
        updateCustomerName(1, "John Smith");
        placeOrder(1, "Shoes");
        deleteCustomer(1);
    }
}

