package com.study.redis.db.model;

import com.redis.om.spring.annotations.Indexed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash(value = "car")
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    @Id
    private Integer id;

    @Indexed
    private String brand;
}
