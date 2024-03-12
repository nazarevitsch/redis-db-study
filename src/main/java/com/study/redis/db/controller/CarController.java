package com.study.redis.db.controller;

import com.study.redis.db.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
@RequiredArgsConstructor
public class CarController {

    private final CarService service;

    @PostMapping("/generation/{count}")
    public void generation(@PathVariable Integer count) {
        this.service.generate(count);
    }
}
