package com.praveen;

public class Invoice {
    private int invoiceNo;
    private double amount;
    private double tax;

    public Invoice(int invoiceNo, double amount) {
        this.invoiceNo = invoiceNo;
        this.amount = amount;
    }

    protected void setTax(double tax) {
        this.tax = tax;
    }

    public int getInvoiceNo() {
        return invoiceNo;
    }

    public double getAmount() {
        return amount;
    }

    public double getTax() {
        return tax;
    }
}
