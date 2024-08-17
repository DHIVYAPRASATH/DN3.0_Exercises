package com.singletonpattern;

public class Logger {

    // Step 1: Create a private static instance of the class (Lazy Initialization)
    private static Logger instance;

    // Step 2: Make the constructor private so no other class can instantiate it
    private Logger() {
        // Optional: Initialization code here
    }

    // Step 3: Provide a public static method to get the instance of the class
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Example method to demonstrate logging
    public void log(String message) {
        System.out.println("Log Message: " + message);
    }
}
