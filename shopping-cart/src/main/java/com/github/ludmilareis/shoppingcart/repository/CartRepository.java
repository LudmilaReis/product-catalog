package com.github.ludmilareis.shoppingcart.repository;

import com.github.ludmilareis.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
