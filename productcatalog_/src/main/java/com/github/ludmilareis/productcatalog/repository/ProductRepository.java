package com.github.ludmilareis.productcatalog.repository;

import com.github.ludmilareis.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}