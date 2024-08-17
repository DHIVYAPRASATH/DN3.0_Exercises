package com.observerpattern;

public class ObserverPatternTest {
    public static void main(String[] args) {
        // Create the stock market
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        // Register observers with the stock market
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Change stock price and notify observers
        stockMarket.setStockPrice(150.00);
        stockMarket.setStockPrice(200.00);

        // Deregister one observer and update stock price
        stockMarket.deregisterObserver(webApp);
        stockMarket.setStockPrice(250.00);
    }
}
