package org.example.sample_3.tablemodule;

/**
 * @author muhammad.khadafi
 */
public class ProductController {
    private ProductTableModule productTableModule;

    public void addProduct(String name, double price) {
        // Validasi input
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Product price must be greater than 0");
        }

        // Panggil metode table module untuk menambahkan produk
        productTableModule.addProduct(name, price);

        // Proses lain (misalnya, mengirim notifikasi ke sistem lain)
    }

    public void deleteProduct(int productId) {
        // Validasi input
        if (productId <= 0) {
            throw new IllegalArgumentException("Invalid product ID");
        }

        // Panggil metode table module untuk menghapus produk
        productTableModule.deleteProduct(productId);

        // Proses lain (misalnya, menghapus data terkait dari sistem lain)
    }

}

