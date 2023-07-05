package org.example.sample_2.tablemodule;

/**
 * @author muhammad.khadafi
 */
class CustomerService {
    private CustomerTableModule customerTableModule;

    public CustomerService() {
        customerTableModule = new CustomerTableModule();
    }

    public void placeOrder(int customerId, String product) {
        // Perform additional operations or validations if needed
        customerTableModule.placeOrder(customerId, product);
    }
}
