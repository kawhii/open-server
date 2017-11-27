/*
 * 版权所有.(c)2008-2017. 卡尔科技工作室
 */

package com.kawhii.open.core.auth.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Carl
 * @date 2017/11/27
 */
@Controller
@RequestMapping("/wiki")
public class WikiController {

    @RequestMapping("")
    @ResponseBody
    public String index() {
        return "wiki-index";
    }

    @RequestMapping("/doc")
    public String doc() {
        return "doc";
    }
}
