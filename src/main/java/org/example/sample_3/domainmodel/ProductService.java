package org.example.sample_3.domainmodel;

/**
 * @author muhammad.khadafi
 */
public class ProductService {
    private ProductRepository productRepository;

    public void addProduct(String name, double price) {
        // Validasi input
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Product price must be greater than 0");
        }

        // Buat objek Product baru
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);

        // Panggil metode repositori untuk menyimpan produk
        productRepository.addProduct(product);

        // Proses lain (misalnya, mengirim notifikasi ke sistem lain)
        sendNotification("Product added: " + product.getName());
    }

    public void deleteProduct(int productId) {
        // Validasi input
        if (productId <= 0) {
            throw new IllegalArgumentException("Invalid product ID");
        }

        // Panggil metode repositori untuk menghapus produk
        productRepository.deleteProduct(productId);

        // Proses lain (misalnya, menghapus data terkait dari sistem lain)
        updateRelatedData(productId);
    }

    private void sendNotification(String message) {
        // Logika untuk mengirim notifikasi
        System.out.println("Notification: " + message);
    }

    private void updateRelatedData(int productId) {
        // Logika untuk memperbarui data terkait
        System.out.println("Updating related data for product ID: " + productId);
    }
}
