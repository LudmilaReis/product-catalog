package com.github.ludmilareis.shoppingcart.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@RedisHash("cart")
public class Cart {
    @Id
    private Integer id;
    private List<Item> items;

    public Cart(Integer id) {
        this.id = id;
    }

    public List<Item> getItem() {
        if (items == null) {
            items = new ArrayList<>();
        }
        return items;
    }

}


