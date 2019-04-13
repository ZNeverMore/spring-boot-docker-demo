package com.zh.springbootdocker.service;

/**
 * @author zhangqiang
 * @date 2019-04-13
 */

public interface VisitsService {

    Integer findVisitsByAddr(String addr);

    int updateVisitsByAddr(String addr);

    void insertRecord(Integer times, String addr);

}
