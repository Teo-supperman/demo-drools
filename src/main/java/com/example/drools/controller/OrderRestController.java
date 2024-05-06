package com.example.drools.controller;

import com.example.drools.model.OrderDto;
import com.example.drools.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderRestController {
	
    private final OrderService service;

    @PostMapping("/order")
    public ResponseEntity<OrderDto.Response> getDiscount(@RequestBody OrderDto.Request request) {
        return new ResponseEntity<>(service.getDiscount(request), HttpStatus.OK);
    }
}
