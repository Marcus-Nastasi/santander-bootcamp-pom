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

    public void update(BuyedItem buyedItem) {
        this.setProduct(buyedItem.getProduct());
        this.setQuantity(buyedItem.getQuantity());
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    private void setProduct(Product product) {
        this.product = product;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

