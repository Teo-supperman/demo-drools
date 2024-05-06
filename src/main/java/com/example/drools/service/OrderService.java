package com.example.drools.service;

import com.example.drools.model.OrderDto;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private  KieContainer kieContainer;

    public OrderDto.Response getDiscount(OrderDto.Request request) {
        OrderDto.Response response = new OrderDto.Response();
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("response", response);
        kieSession.insert(request);
        kieSession.fireAllRules();
        kieSession.dispose();
        return response;
    }
}
