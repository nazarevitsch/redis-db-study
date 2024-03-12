package com.study.redis.db.service;

import com.study.redis.db.model.Car;
import com.study.redis.db.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService {

    private final CarRepository repository;

    public void generate(int count) {
        for (int i = 0; i < count; i++) {
            repository.save(new Car(i, Randomizer.randomBrand()));
        }
    }
}
