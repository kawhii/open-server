/*
 * 版权所有.(c)2008-2018. 卡尔科技工作室
 */

package com.kawhii.open.demo.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.Principal;
import java.util.Collections;
import java.util.Map;

/**
 * @author Carl
 * @version 创建时间：2018/1/20
 * @since 1.0.0
 */
@Configuration
@ComponentScan
@RestController
@RequestMapping("/dashboard")
public class SSOConfigurer {
    @RequestMapping("/message")
    public Map<String, Object> dashboard() {
        return Collections.singletonMap("message", "Yay!");
    }

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }



    @Controller
    public static class LoginErrors {

        @RequestMapping("/dashboard/login")
        public String dashboard() {
            return "redirect:/hello";
        }

    }

    @Component
    @EnableOAuth2Sso
    public static class LoginConfigurer extends WebSecurityConfigurerAdapter {

        @Override
        public void configure(HttpSecurity http) throws Exception {
            //dashboard开头的都需要登录访问，其余均可以匿名访问
            http.authorizeRequests().antMatchers("/dashboard/**").authenticated().and()
                    .authorizeRequests().anyRequest().permitAll().and()
                    .logout().logoutUrl("/dashboard/logout").permitAll()
                    .logoutSuccessUrl("/");
        }
    }
}
