package com.santander.Domain;

public class BuyedItem {

    private Product product;
    private int quantity;

    public BuyedItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotal() {
        return this.quantity * this.product.getPrice();
    }

    @Override
    public String toString() {
        return("BuyedItem{" + "product=" + product + ", quantity=" + quantity + '}');
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}

