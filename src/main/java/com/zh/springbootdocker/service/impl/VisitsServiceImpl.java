package com.zh.springbootdocker.service.impl;

import com.zh.springbootdocker.dao.VisitsDao;
import com.zh.springbootdocker.service.VisitsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhangqiang
 * @date 2019-04-13
 */
@Service
public class VisitsServiceImpl implements VisitsService {

    @Resource
    VisitsDao visitsDao;

    @Override
    public Integer findVisitsByAddr(String addr) {
        return visitsDao.findVisitsByAddr(addr);
    }

    @Override
    public int updateVisitsByAddr(String addr) {
        return visitsDao.updateVisitsByAddr(addr);
    }

    @Override
    public void insertRecord(Integer times, String addr) {
        visitsDao.insertRecord(times, addr);
    }
}
