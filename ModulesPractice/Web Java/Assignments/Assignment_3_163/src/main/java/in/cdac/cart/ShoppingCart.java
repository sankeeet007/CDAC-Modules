package in.cdac.cart;


import java.util.ArrayList;
import java.util.Iterator;

import in.cdac.entity.Products;

public class ShoppingCart implements Cart {
    ArrayList<Products> allItems = new ArrayList<>();

    @Override
    public void addToCart(Products objProduct) {
        allItems.add(objProduct);
    }

    @Override
    public Iterator<Products> listCart() {
        return allItems.iterator();
    }
}

