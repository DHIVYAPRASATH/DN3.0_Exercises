package com.example.ecommerce.search;

import com.example.ecommerce.model.Product;

import java.util.Arrays;

public class BinarySearch {
    public static Product binarySearch(Product[] products, String targetProductName) {
        Arrays.sort(products, (p1, p2) -> p1.getProductName().compareToIgnoreCase(p2.getProductName()));
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Product midProduct = products[mid];
            int comparison = midProduct.getProductName().compareToIgnoreCase(targetProductName);

            if (comparison == 0) {
                return midProduct;
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}
