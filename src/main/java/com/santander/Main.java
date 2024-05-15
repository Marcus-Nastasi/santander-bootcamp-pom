package com.santander;

import com.santander.Domain.BuyedItem;
import com.santander.Domain.Product;
import com.santander.Domain.Purchase;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1001, "Apple", 1.99);
        BuyedItem buyedItem = new BuyedItem(product, 2);
        Purchase purchase = new Purchase();
        purchase.addBuyedItem(buyedItem);
        System.out.println(purchase.calculateTotal());
    }
}

