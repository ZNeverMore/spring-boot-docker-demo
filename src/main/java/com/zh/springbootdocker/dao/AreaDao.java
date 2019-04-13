package com.zh.springbootdocker.dao;

import com.zh.springbootdocker.entity.AreaEntity;

/**
 * @author zhangqiang
 * @date 2019-04-13
 */

public interface AreaDao {

    AreaEntity findAreaById(Integer id);

}
