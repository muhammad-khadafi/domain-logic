package org.example.sample_3.domainmodel;

/**
 * @author muhammad.khadafi
 */
public class ProductRepository {
    public void addProduct(Product product) {
        // Logika untuk menyimpan data produk ke database
        System.out.println("Adding product: " + product.getName() + ", Price: " + product.getPrice());
    }

    public void deleteProduct(int productId) {
        // Logika untuk menghapus data produk dari database
        System.out.println("Deleting product with ID: " + productId);
    }

    public Product getProductById(int productId) {
        // Logika untuk mendapatkan data produk berdasarkan ID dari database
        // Mengembalikan objek Product yang sesuai
        return new Product();
    }

    // Metode lain untuk operasi data lainnya (misalnya, pembaruan, pencarian)
}
