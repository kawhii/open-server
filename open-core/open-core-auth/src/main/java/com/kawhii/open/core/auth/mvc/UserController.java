/*
 * 版权所有.(c)2008-2017. 卡尔科技工作室
 */

package com.kawhii.open.core.auth.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

/**
 * 当前用户
 * @author Carl
 * @since  1.0.0
 */
@RequestMapping("/me")
@Controller
public class UserController {
    @ResponseBody
    @RequestMapping("")
    public String getPhotoServiceUser(Principal principal)
    {
        return principal.getName();
    }
}
