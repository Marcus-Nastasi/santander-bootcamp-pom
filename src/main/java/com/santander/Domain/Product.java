package com.santander.Domain;

public class Product {

    private final long id;
    private final String name;
    private double price;

    public Product(long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return(
            "Product{" + "id=" + id +
            ", name='" + name + '\'' +
            ", price=" + price + '}'
        );
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}


