package com.ust.product.store;


import org.springframework.data.repository.CrudRepository;

import com.ust.product.enities.Product;

public interface ProductStore extends CrudRepository<Product, Long> {

}
