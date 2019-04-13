package com.zh.springbootdocker.controller;

import com.google.common.collect.Maps;
import com.zh.springbootdocker.common.CommonResult;
import com.zh.springbootdocker.service.VisitsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author zhangqiang
 * @date 2019-04-13
 */
@RestController
public class VisitsController {

    private static final int INITIALIZE_VISITS = 1;

    @Resource
    VisitsService visitsService;

    @GetMapping("/visits")
    public CommonResult getTimes(HttpServletRequest request) {
        String remoteAddr = request.getRemoteAddr();
        Integer visitsByAddr = visitsService.findVisitsByAddr(remoteAddr);
        visitsByAddr = ++visitsByAddr;
        Map<String, Integer> map = Maps.newHashMap();
        if (visitsByAddr == null) {
            visitsService.insertRecord(INITIALIZE_VISITS, remoteAddr);
            map.put("visits", INITIALIZE_VISITS);
            return CommonResult.success(map);
        }
        visitsService.updateVisitsByAddr(remoteAddr, visitsByAddr);
        map.put("visits", visitsByAddr);
        return CommonResult.success(map);
    }

}
