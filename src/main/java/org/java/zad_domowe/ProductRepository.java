package org.java.zad_domowe;

import java.util.LinkedList;
import java.util.List;

public class ProductRepository {

    public List<Product> products;
    public ProductRepository(){
       products = new LinkedList<>();
    }


    public void add(Product product) {
        products.add(product);
    }

    public List<Product> findAll(ProductRepository productRepository) {
        return products;
    }
}