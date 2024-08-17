package com.factorymethod;

public class ExcelDocument extends Document {
    @Override
    public void open() {
        System.out.println("Opening Excel Document...");
    }

    @Override
    public void save() {
        System.out.println("Saving Excel Document...");
    }
}
