package com.santander;

import com.santander.Domain.BuyedItem;
import com.santander.Domain.Product;
import com.santander.Domain.Purchase;

public class Main {
    public static void main(String[] args) {
        try {
            Product product = new Product(1001, "Apple", 1.99);
            Product product2 = new Product(1002, "Banana", 0.99);
            Product product3 = new Product(1003, "Orange", 2.99);
            Product product4 = new Product(1004, "Torange", 4.99);
            BuyedItem buyedItem = new BuyedItem(product, 10);
            BuyedItem buyedItem2 = new BuyedItem(product2, 15);
            BuyedItem buyedItem3 = new BuyedItem(product3, 3);
            BuyedItem buyedItem4 = new BuyedItem(product4, 3);
            Purchase purchase = new Purchase();
            purchase.addBuyedItem(buyedItem);
            purchase.addBuyedItem(buyedItem2);
            purchase.addBuyedItem(buyedItem3);
            purchase.addBuyedItem(buyedItem4);
            System.out.println(purchase);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

