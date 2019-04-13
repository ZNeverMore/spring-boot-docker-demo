package com.zh.springbootdocker.service.impl;

import com.zh.springbootdocker.dao.AreaDao;
import com.zh.springbootdocker.entity.AreaEntity;
import com.zh.springbootdocker.service.AreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangqiang
 * @date 2019-04-13
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Resource
    AreaDao areaDao;

    @Override
    public AreaEntity findAreaById(Integer id) {
        return areaDao.findAreaById(id);
    }
}
