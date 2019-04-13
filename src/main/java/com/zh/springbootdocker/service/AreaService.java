package com.zh.springbootdocker.service;

import com.zh.springbootdocker.entity.AreaEntity;

/**
 * @author zhangqiang
 * @date 2019-04-13
 */

public interface AreaService {

    AreaEntity findAreaById(Integer id);

}
