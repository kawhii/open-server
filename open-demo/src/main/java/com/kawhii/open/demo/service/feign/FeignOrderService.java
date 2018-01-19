/*
 * 版权所有.(c)2008-2018. 卡尔科技工作室
 */

package com.kawhii.open.demo.service.feign;

import com.kawhii.open.demo.service.OrderService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author Carl
 * @version 创建时间：2018/1/19
 * @since 1.0.0
 */
@FeignClient("DEMO")
public interface FeignOrderService extends OrderService {
}
