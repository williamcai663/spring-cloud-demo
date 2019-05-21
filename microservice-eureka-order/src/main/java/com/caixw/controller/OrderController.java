package com.caixw.controller;

import com.caixw.configuration.ServiceInfoUtil;
import com.caixw.vo.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/order")
    public  String getOrder(){
        System.out.println(ServiceInfoUtil.getPort());
        Order order=new Order();
        order.setId(1);
        order.setName("breef");
        order.setPrice(123.12);
        return order.toString();
    }
}
