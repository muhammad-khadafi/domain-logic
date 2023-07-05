package org.example.sample_3.domainmodel;

/**
 * @author muhammad.khadafi
 */
public class ProductController {
    private ProductService productService;

    public void addProduct(String name, double price) {
        // Validasi input
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Product price must be greater than 0");
        }

        // Panggil metode layanan untuk menambahkan produk
        productService.addProduct(name, price);

        // Proses lain (misalnya, mengirim notifikasi ke sistem lain)
    }

    public void deleteProduct(int productId) {
        // Validasi input
        if (productId <= 0) {
            throw new IllegalArgumentException("Invalid product ID");
        }

        // Panggil metode layanan untuk menghapus produk
        productService.deleteProduct(productId);

        // Proses lain (misalnya, menghapus data terkait dari sistem lain)
    }

    }

