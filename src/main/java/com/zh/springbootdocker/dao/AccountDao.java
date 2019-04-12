package com.zh.springbootdocker.dao;

import com.zh.springbootdocker.entity.Account;

/**
 * @author zhangqiang
 * @date 2019-04-12
 */

public interface AccountDao {

    Account findAccountById(Integer id);

}
