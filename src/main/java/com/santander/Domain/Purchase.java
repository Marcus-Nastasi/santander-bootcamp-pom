package com.santander.Domain;

import java.util.ArrayList;
import java.util.List;

public class Purchase {

    private final List<BuyedItem> buyedItems = new ArrayList<>();

    public Purchase() {}

    public List<BuyedItem> getBuyedItems() {
        return buyedItems;
    }
}

