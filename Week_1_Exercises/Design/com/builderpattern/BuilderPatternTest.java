package com.builderpattern;

public class BuilderPatternTest {
    public static void main(String[] args) {
        // Create a Computer using the Builder pattern
        Computer computer1 = new Computer.Builder("Intel i7", "16GB")
                .setStorage("1TB SSD")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        System.out.println(computer1);

        // Create another Computer with different configuration
        Computer computer2 = new Computer.Builder("AMD Ryzen 5", "8GB")
                .setStorage("512GB SSD")
                .build();

        System.out.println(computer2);
    }
}
