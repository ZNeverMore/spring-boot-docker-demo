package com.zh.springbootdocker;

import com.zh.springbootdocker.dao.VisitsDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDockerApplicationTests {

    @Resource
    VisitsDao visitsDao;

    @Test
    public void contextLoads() {
        int aaa = visitsDao.findVisitsByAddr("aaa");
        System.out.println(aaa);

    }

}
