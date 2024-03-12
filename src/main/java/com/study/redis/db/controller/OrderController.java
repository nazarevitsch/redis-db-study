package com.study.redis.db.controller;

import com.study.redis.db.dto.OrderDto;
import com.study.redis.db.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @PostMapping("/generation/{count}")
    public void generation(@PathVariable Integer count) {
        this.service.generate(count);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDto> get(@PathVariable Integer id) {
        return ResponseEntity.ok(this.service.get(id));
    }

    @GetMapping("/byBrand")
    public ResponseEntity<List<OrderDto>> getByBrand(@RequestParam String brand) {
        return ResponseEntity.ok(this.service.getByBrand(brand));
    }

    @GetMapping("/byState")
    public ResponseEntity<List<OrderDto>> getByState(@RequestParam String state) {
        return ResponseEntity.ok(this.service.getByState(state));
    }
}
