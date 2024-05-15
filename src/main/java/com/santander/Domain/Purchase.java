package com.santander.Domain;

import java.util.ArrayList;
import java.util.List;

public class Purchase {

    private final List<BuyedItem> buyedItems = new ArrayList<>();

    public Purchase() {}

    public double calculateTotal() {
        return this.buyedItems.stream().map(BuyedItem::getTotal).reduce((ac, n) -> ac += n).get();
    }

    public void addBuyedItem(BuyedItem buyedItem) {
        this.buyedItems.add(buyedItem);
    }

    public void removeBuyedItem(BuyedItem buyedItem) {
        this.buyedItems.remove(buyedItem);
    }

    @Override
    public String toString() {
        return("Purchase{" + "buyedItems=" + buyedItems + ", subTotal: $" + this.calculateTotal() + '}');
    }

    public List<BuyedItem> getBuyedItems() {
        return buyedItems;
    }
}

