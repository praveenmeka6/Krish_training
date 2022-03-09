package com.praveen;

public class Application {
    public static void main(String[] args) {
        VAT vat = new VAT();
        NBT nbt = new NBT();
        BTT btt = new BTT();
        SSF ssf = new SSF();
        Tax tax = new Tax();

        tax.setSuccessor(vat);
        vat.setSuccessor(nbt);
        nbt.setSuccessor(btt);
        btt.setSuccessor(ssf);

        Invoice invoice = new Invoice(1,100);
        System.out.println(tax.applyTax(invoice));

        Invoice invoice1 = new Invoice(1,450);
        System.out.println(tax.applyTax(invoice1));

    }
}
