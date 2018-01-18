/*
 * 版权所有.(c)2008-2018. 卡尔科技工作室
 */

package com.kawhii.open.demo.mvc;

import com.kawhii.open.demo.config.RabbitConfiguration;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 发送
 *
 * @author Carl
 * @version 创建时间：2018/1/18
 * @since 1.0.0
 */
@RestController
@RequestMapping("/send")
public class RabbitMQSendController {
    @Autowired
    private RabbitTemplate template;

    @RequestMapping("/{msg}")
    public String send(@PathVariable String msg) {
        template.convertAndSend(RabbitConfiguration.queueName, "RabbitMQSendController Send:" + msg);
        return "输入：" + msg;
    }
}
