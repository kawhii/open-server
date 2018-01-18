/*
 * 版权所有.(c)2008-2018.广州市森锐科技股份有限公司
 */

package com.kawhii.open.core.auth.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Carl
 * @version 创建时间：2018/1/18
 * @since 1.0.0
 */
@FeignClient("wiki")
public interface FeignWikiServer {
    @RequestMapping("/name")
    String name(@RequestParam(value = "name") String name);
}
