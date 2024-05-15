package com.santander;

import com.santander.Domain.BuyedItem;
import com.santander.Domain.Product;
import com.santander.Domain.Purchase;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1001, "Apple", 1.99);
        Product product2 = new Product(1002, "Banana", 0.99);
        Product product3 = new Product(1003, "Orange", 2.99);
        Product product4 = new Product(1004, "Torange", 4.99);
        BuyedItem buyedItem = new BuyedItem(product, 2);
        Purchase purchase = new Purchase();
        purchase.addBuyedItem(buyedItem);
        System.out.println(purchase);
    }
}

