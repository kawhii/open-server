/*
 * 版权所有.(c)2008-2018. 卡尔科技工作室
 */

package com.kawhii.open.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author Carl
 * @version 创建时间：2018/1/18
 * @since 1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
//client独立扫描指定包
@EnableFeignClients
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
