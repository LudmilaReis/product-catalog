package com.github.ludmilareis.shoppingcart.model;

import lombok.*;
import org.springframework.data.redis.core.RedisHash;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@RedisHash("item")
public class Item {
    private Integer id;
    private Integer amount;
}
