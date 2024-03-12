package com.study.redis.db.repository;

import com.redis.om.spring.repository.RedisEnhancedRepository;
import com.study.redis.db.model.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends RedisEnhancedRepository<Order, Integer> {

    List<Order> findAllByBrand(String brand);

    List<Order> findAllByState(String State);
}
