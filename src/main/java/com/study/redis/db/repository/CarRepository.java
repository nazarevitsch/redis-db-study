package com.study.redis.db.repository;

import com.redis.om.spring.repository.RedisEnhancedRepository;
import com.study.redis.db.model.Car;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends RedisEnhancedRepository<Car, Integer> {
}
