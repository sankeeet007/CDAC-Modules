package in.cdac.dao;

import in.cdac.entity.Products;
import in.cdac.exceptions.CategoryException;
import in.cdac.exceptions.ProductException;

public interface ProductsDAO {

    public boolean addProduct(Products objProduct) throws ProductException;
    public Products getProductDetails(int productId) throws ProductException;
    public boolean deleteProduct(int productId) throws ProductException;
}