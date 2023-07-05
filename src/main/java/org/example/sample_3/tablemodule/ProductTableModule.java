package org.example.sample_3.tablemodule;

/**
 * @author muhammad.khadafi
 */
public class ProductTableModule {
    public void addProduct(String name, double price) {
        // Validasi input
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Product price must be greater than 0");
        }

        // Logika bisnis untuk menambahkan produk
        // Misalnya, validasi tambahan, perhitungan, dll.
        // Simpan data produk ke database
        System.out.println("Adding product: " + name + ", Price: " + price);

        // Proses lain (misalnya, mengirim notifikasi ke sistem lain)
        sendNotification("Product added: " + name);
    }

    public void deleteProduct(int productId) {
        // Validasi input
        if (productId <= 0) {
            throw new IllegalArgumentException("Invalid product ID");
        }

        // Logika bisnis untuk menghapus produk
        // Misalnya, validasi tambahan, pengecekan ketergantungan, dll.
        // Hapus data produk dari database
        System.out.println("Deleting product with ID: " + productId);

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

