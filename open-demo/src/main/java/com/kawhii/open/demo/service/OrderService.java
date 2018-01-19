/*
 * 版权所有.(c)2008-2018. 卡尔科技工作室
 */


package com.kawhii.open.demo.service;

import com.kawhii.open.demo.domain.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * 服务接口
 *
 * @author Carl
 * @version 创建时间：2018/1/19
 * @since 1.0.0
 */
public interface OrderService {

    //获取所有订单
    @GetMapping(value = "/eureka-orders/fetch")
    List<Order> findAll();


    //获取id
    @GetMapping(value = "/eureka-orders/{id}")
    Order loadByItemCode(@PathVariable("id") String id);
}
