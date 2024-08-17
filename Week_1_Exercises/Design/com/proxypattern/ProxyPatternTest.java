package com.proxypattern;

public class ProxyPatternTest {
    public static void main(String[] args) {
        // Create proxy objects for images
        Image image1 = new ProxyImage("http://example.com/image1.jpg");
        Image image2 = new ProxyImage("http://example.com/image2.jpg");

        // Display the images
        // The real image will be loaded only on the first call
        image1.display();
        image1.display(); // Cached image, should not load again

        image2.display();
        image2.display(); // Cached image, should not load again
    }
}
