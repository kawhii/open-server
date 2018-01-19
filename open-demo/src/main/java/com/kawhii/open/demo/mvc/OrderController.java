/*
 * 版权所有.(c)2008-2018. 卡尔科技工作室
 */


package com.kawhii.open.demo.mvc;

import com.kawhii.open.demo.domain.Order;
import com.kawhii.open.demo.service.feign.FeignOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Carl
 * @version 创建时间：2018/1/19
 * @since 1.0.0
 */
@RequestMapping("/orders")
@RestController
public class OrderController {
    Logger LOGGER = LoggerFactory.getLogger(getClass());
    @Autowired
    private FeignOrderService orderService;


    //获取所有订单
    @GetMapping(value = "/fetch")
    public List<Order> findAll() {
        LOGGER.info("OrderController.fetch");
        return orderService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Order loadByItemCode(@PathVariable String id) {
        return orderService.loadByItemCode(id);
    }
}
