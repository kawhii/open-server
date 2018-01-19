/*
 * 版权所有.(c)2008-2018. 卡尔科技工作室
 */

/*
 * 版权所有.(c)2008-2018. 卡尔科技工作室
 */

package com.kawhii.open.demo.endpoint;

import com.netflix.appinfo.EurekaInstanceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Carl
 * @version 创建时间：2018/1/19
 * @since 1.0.0
 */
@RestController
@RequestMapping("/eureka")
public class HelloEurekaEndpoint {
    protected Logger logger = LoggerFactory.getLogger(HelloEurekaEndpoint.class);

    @Autowired
    private EurekaInstanceConfig eurekaInstanceConfig;
    @Value("${server.port}")
    private int serverPort = 0;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        this.logger.info("/hello, instanceId:{}, host:{}", eurekaInstanceConfig.getInstanceId(), eurekaInstanceConfig.getHostName(false));
        return "Hello, Spring Cloud! My port is " + String.valueOf(serverPort);
    }
}
