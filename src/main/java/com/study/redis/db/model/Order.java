package com.study.redis.db.model;

import com.redis.om.spring.annotations.Indexed;
import com.redis.om.spring.annotations.Searchable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash(value = "order")
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    private Integer id;

    @Indexed
    private String brand;

    @Searchable
    private String state;

    @Indexed
    private int price;
}
