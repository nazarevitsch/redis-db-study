package com.study.redis.db.dto;

import lombok.Data;

@Data
public class OrderDto {
    private Integer id;
    private String brand;
    private String state;
    private int price;
}
