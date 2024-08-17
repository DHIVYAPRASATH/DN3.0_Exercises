package com.financialforecasting.main;

import com.financialforecasting.forecast.Forecast;

public class Main {
    public static void main(String[] args) {
        double initialValue = 1000.0; // Initial value of the investment
        double growthRate = 0.05;    // Annual growth rate (5%)
        int years = 10;              // Number of years

        double futureValue = Forecast.calculateFutureValue(initialValue, growthRate, years);
        System.out.println("Future value after " + years + " years: " + futureValue);
    }
}
