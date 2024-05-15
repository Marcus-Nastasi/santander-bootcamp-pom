package com.santander.Domain;

import java.util.ArrayList;
import java.util.List;

public class Purchase {

    private final List<BuyedItem> buyedItems = new ArrayList<>();

    public Purchase() {}

    @Override
    public String toString() {
        return("Purchase{" + "buyedItems=" + buyedItems + ", subTotal: $" + this.calculateTotal() + '}');
    }

    public double calculateTotal() {
        return this.buyedItems.stream().map(BuyedItem::getTotal).reduce((ac, n) -> ac += n).get();
    }

    public void addBuyedItem(BuyedItem buyedItem) {
        this.buyedItems.add(buyedItem);
    }

    public void removeBuyedItem(BuyedItem buyedItem) {
        this.buyedItems.remove(buyedItem);
    }

    public void updateBuyedItem(BuyedItem buyedItem1, BuyedItem buyedItem2) throws RuntimeException {
        if (this.buyedItems.isEmpty()) throw new RuntimeException("Purchase list empty");
        this.buyedItems.forEach(b -> {
            if (b.equals(buyedItem1)) b.update(buyedItem2);
        });
    }

    public List<BuyedItem> getBuyedItems() {
        return buyedItems;
    }
}

