package com.zh.springbootdocker.service.impl;

import com.zh.springbootdocker.dao.AccountDao;
import com.zh.springbootdocker.entity.Account;
import com.zh.springbootdocker.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangqiang
 * @date 2019-04-12
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Resource
    AccountDao accountDao;

    @Override
    public Account findAccountById(Integer id) {
        return accountDao.findAccountById(id);
    }
}
