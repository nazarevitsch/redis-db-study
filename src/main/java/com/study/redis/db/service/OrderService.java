package com.study.redis.db.service;

import com.study.redis.db.converter.OrderConverter;
import com.study.redis.db.dto.OrderDto;
import com.study.redis.db.model.Order;
import com.study.redis.db.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repository;
    private final OrderConverter converter;

    public void generate(int count) {
        for (int i = 0; i < count; i++) {
            repository.save(new Order(i, Randomizer.randomBrand(), Randomizer.randomState(), Randomizer.randomPrice()));
        }
    }

    public OrderDto get(Integer id) {
        return repository.findById(id)
                .map(converter::fromDbToDto)
                .get();
    }

    public List<OrderDto> getByBrand(String brand) {
        return this.repository.findAllByBrand(brand)
                .stream()
                .map(this.converter::fromDbToDto)
                .toList();
    }

    public List<OrderDto> getByState(String state) {
        return this.repository.findAllByState(state)
                .stream()
                .map(this.converter::fromDbToDto)
                .toList();
    }
}
