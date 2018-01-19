/*
 * 版权所有.(c)2008-2018. 卡尔科技工作室
 */


package com.kawhii.open.demo.endpoint;

import com.kawhii.open.demo.domain.Order;
import com.kawhii.open.demo.service.OrderService;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Carl
 * @version 创建时间：2018/1/19
 * @since 1.0.0
 */
@RestController
public class OrderEurekaEndpoint implements OrderService {
    @Override
    public List<Order> findAll() {
        List<Order> orders = new ArrayList<>();
        Order o1 = new Order().setBusiness("b1").setCode("c1").setCreateTime(new Date()).setId("1");
        Order o2 = new Order().setBusiness("b2").setCode("c2").setCreateTime(new Date()).setId("2");
        Order o3 = new Order().setBusiness("b3").setCode("c3").setCreateTime(new Date()).setId("3");
        orders.add(o1);
        orders.add(o2);
        orders.add(o3);
        return orders;
    }

    @Override
    public Order loadByItemCode(String id) {
        return new Order().setId(id).setBusiness("b" + id).setCode("c" + id).setCreateTime(new Date());
    }
}
