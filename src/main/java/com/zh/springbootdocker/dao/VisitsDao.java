package com.zh.springbootdocker.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @author zhangqiang
 * @date 2019-04-13
 */

public interface VisitsDao {

    Integer findVisitsByAddr(String addr);

    Integer updateVisitsByAddr(String addr);

    void insertRecord(@Param("times") Integer times, @Param("addr") String addr);

}
