package org.java.zad_domowe;

import java.util.List;

public class ProductRepository {

    private ProductRepository productRepository;



    private List<Product> products;

    public void add(Product product) {
       this.productRepository.add(product);
    }

    public void count(Product product){
        product.getPrice();
    }
}
