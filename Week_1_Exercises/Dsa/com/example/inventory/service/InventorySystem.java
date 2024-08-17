package com.example.inventory.service;

import com.example.inventory.model.Product;

import java.util.HashMap;
import java.util.Map;

public class InventorySystem {
    private Map<String, Product> inventory;

    public InventorySystem() {
        inventory = new HashMap<>();
    }

    // Add a new product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Update an existing product
    public void updateProduct(String productId, String productName, int quantity, double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setProductName(productName);
            product.setQuantity(quantity);
            product.setPrice(price);
        } else {
            System.out.println("Product not found!");
        }
    }

    // Delete a product
    public void deleteProduct(String productId) {
        inventory.remove(productId);
    }

    // Retrieve product details
    public Product getProduct(String productId) {
        return inventory.get(productId);
    }
}
