package com.example.inventory.main;

import com.example.inventory.model.Product;
import com.example.inventory.service.InventorySystem;

public class Main {
    public static void main(String[] args) {
        InventorySystem inventorySystem = new InventorySystem();

        // Add products
        Product product1 = new Product("1", "Laptop", 10, 999.99);
        Product product2 = new Product("2", "Smartphone", 20, 499.99);
        inventorySystem.addProduct(product1);
        inventorySystem.addProduct(product2);

        // Update a product
        inventorySystem.updateProduct("1", "Laptop Pro", 8, 1099.99);

        // Get product details
        System.out.println(inventorySystem.getProduct("1"));

        // Delete a product
        inventorySystem.deleteProduct("2");

        // Try to get the deleted product
        System.out.println(inventorySystem.getProduct("2"));
    }
}
