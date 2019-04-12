package com.zh.springbootdocker.service;

import com.zh.springbootdocker.entity.Account;

/**
 * @author zhangqiang
 * @date 2019-04-12
 */

public interface AccountService {

    Account findAccountById(Integer id);

}
