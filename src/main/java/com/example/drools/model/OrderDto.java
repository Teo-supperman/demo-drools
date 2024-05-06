package com.example.drools.model;

import lombok.Data;


public class OrderDto {

    @Data
    public static class Request {
        private String customerNumber;
        private Integer age;
        private Integer amount;
    }
    @Data
    public static class Response {
        private Integer discount = 0;
    }

}
