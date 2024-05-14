package com.santander;

import com.santander.Domain.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1001, "Apple", 1.99);
        System.out.println(product);
    }
}

