package com.praveen;

public class Tax extends Handler{

    @Override
    public double applyTax(Invoice invoice) {
        return successor.applyTax(invoice);
    }
}
