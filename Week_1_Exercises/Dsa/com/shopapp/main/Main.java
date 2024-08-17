package com.shopapp.main;

import com.shopapp.model.Order;
import com.shopapp.sort.BubbleSort;
import com.shopapp.sort.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Order[] orders = {
                new Order("1", "Alice", 250.50),
                new Order("2", "Bob", 120.75),
                new Order("3", "Charlie", 305.99),
                new Order("4", "David", 50.00),
                new Order("5", "Eve", 700.00)
        };

        // Bubble Sort
        System.out.println("Before Bubble Sort:");
        System.out.println(Arrays.toString(orders));

        BubbleSort.bubbleSort(orders);
        System.out.println("After Bubble Sort:");
        System.out.println(Arrays.toString(orders));

        // Reset orders for Quick Sort demonstration
        orders = new Order[]{
                new Order("1", "Alice", 250.50),
                new Order("2", "Bob", 120.75),
                new Order("3", "Charlie", 305.99),
                new Order("4", "David", 50.00),
                new Order("5", "Eve", 700.00)
        };

        // Quick Sort
        System.out.println("Before Quick Sort:");
        System.out.println(Arrays.toString(orders));

        QuickSort.quickSort(orders, 0, orders.length - 1);
        System.out.println("After Quick Sort:");
        System.out.println(Arrays.toString(orders));
    }
}
