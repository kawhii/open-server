/*
 * 版权所有.(c)2008-2018. 卡尔科技工作室
 */


package com.kawhii.open.demo.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单
 *
 * @author Carl
 * @version 创建时间：2018/1/19
 * @since 1.0.0
 */
public class Order implements Serializable {
    private String id;
    private String code;
    private String business;
    private Date createTime;

    public String getId() {
        return id;
    }

    public Order setId(String id) {
        this.id = id;
        return this;
    }

    public String getCode() {
        return code;
    }

    public Order setCode(String code) {
        this.code = code;
        return this;
    }

    public String getBusiness() {
        return business;
    }

    public Order setBusiness(String business) {
        this.business = business;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Order setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }
}
