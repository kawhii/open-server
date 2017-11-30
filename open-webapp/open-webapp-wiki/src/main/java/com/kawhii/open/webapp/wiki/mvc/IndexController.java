/*
 * 版权所有.(c)2008-2017. 卡尔科技工作室
 */

package com.kawhii.open.webapp.wiki.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页控制器
 *
 * @author Carl
 * @version 创建时间：2017/11/30
 * @since 1.0.0
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
