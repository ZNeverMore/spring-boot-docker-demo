package com.zh.springbootdocker.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author zhangqiang
 * @date 2019-04-12
 */
@Data
public class Account {

    private Integer id;

    private String aname;

    private BigDecimal money;

}
