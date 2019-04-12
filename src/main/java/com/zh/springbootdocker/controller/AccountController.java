package com.zh.springbootdocker.controller;

import com.zh.springbootdocker.common.CommonResult;
import com.zh.springbootdocker.entity.Account;
import com.zh.springbootdocker.enums.HttpStatus;
import com.zh.springbootdocker.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhangqiang
 * @date 2019-04-12
 */
@RestController
public class AccountController {

    @Resource
    AccountService accountService;

    @GetMapping("/get")
    public CommonResult getAccount(Integer id) {
        Account account = accountService.findAccountById(id);
        if (account == null) {
            return CommonResult.fail(HttpStatus.NOT_FOUND);
        }
        return CommonResult.success("success");
    }

}
