package com.example.ecommerce.main;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.search.BinarySearch;
import com.example.ecommerce.search.LinearSearch;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("1", "Laptop", "Electronics"),
                new Product("2", "Smartphone", "Electronics"),
                new Product("3", "Coffee Maker", "Home Appliances"),
                new Product("4", "Headphones", "Electronics"),
                new Product("5", "Book", "Books")
        };

        // Linear Search Example
        Product foundProduct = LinearSearch.linearSearch(products, "Coffee Maker");
        System.out.println("Linear Search Result: " + foundProduct);

        // Binary Search Example
        foundProduct = BinarySearch.binarySearch(products, "Laptop");
        System.out.println("Binary Search Result: " + foundProduct);
    }
}
