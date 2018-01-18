/*
 * 版权所有.(c)2008-2017. 卡尔科技工作室
 */

package com.kawhii.open.webapp.wiki.mvc;

import com.kawhii.open.webapp.wiki.config.RabbitConfiguration;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 首页控制器
 *
 * @author Carl
 * @version 创建时间：2017/11/30
 * @since 1.0.0
 */
@Controller
public class IndexController {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/name")
    @ResponseBody
    public String name(@RequestParam String name) {
        rabbitTemplate.convertAndSend(RabbitConfiguration.queueName, "hello：" + name);
        return "wiki:" + name;
    }
}
