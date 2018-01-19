/*
 * 版权所有.(c)2008-2018. 卡尔科技工作室
 */

package com.kawhii.open.demo.service.feign;

import com.kawhii.open.demo.domain.Order;
import com.kawhii.open.demo.service.OrderService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author Carl
 * @version 创建时间：2018/1/19
 * @since 1.0.0
 */
@FeignClient("DEMO")
public interface FeignOrderService extends OrderService {
    //获取所有订单
    @GetMapping(value = "/eureka-orders/fetch")
    List<Order> findAll();


    //获取id
    @GetMapping(value = "/eureka-orders/{id}")
    Order loadByItemCode(@PathVariable("id") String id);
}
