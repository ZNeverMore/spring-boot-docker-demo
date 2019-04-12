package com.zh.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangqiang
 * @date 2019-04-12
 */
@RestController
public class IndexController {

    @GetMapping("/index")
    public String index() {
        return "hello";
    }

}
