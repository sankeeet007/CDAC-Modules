package in.cdac.cart;

import java.util.Iterator;

import in.cdac.entity.Products;

public interface Cart {
    public void addToCart(Products objProduct);
    public Iterator<Products> listCart();
}