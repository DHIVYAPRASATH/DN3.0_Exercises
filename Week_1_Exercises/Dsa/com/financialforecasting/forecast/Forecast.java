package com.financialforecasting.forecast;

public class Forecast {

    // Recursive method to calculate future value based on initial value, growth rate, and years
    public static double calculateFutureValue(double initialValue, double growthRate, int years) {
        // Base case: if years is 0, return the initial value
        if (years == 0) {
            return initialValue;
        }

        // Recursive case: calculate future value for the next year
        return calculateFutureValue(initialValue * (1 + growthRate), growthRate, years - 1);
    }

    // Iterative method to calculate future value based on initial value, growth rate, and years
    public static double calculateFutureValueIterative(double initialValue, double growthRate, int years) {
        double futureValue = initialValue;
        for (int i = 0; i < years; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }
}
