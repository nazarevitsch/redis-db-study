package com.study.redis.db.converter;

import com.study.redis.db.dto.OrderDto;
import com.study.redis.db.model.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderConverter {

    public OrderDto fromDbToDto(Order order) {
        OrderDto dto = new OrderDto();
        dto.setId(order.getId());
        dto.setBrand(order.getBrand());
        dto.setState(order.getState());
        dto.setPrice(order.getPrice());
        return dto;
    }
}
