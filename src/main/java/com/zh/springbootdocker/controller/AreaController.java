package com.zh.springbootdocker.controller;

import com.zh.springbootdocker.common.CommonResult;
import com.zh.springbootdocker.entity.AreaEntity;
import com.zh.springbootdocker.enums.HttpStatus;
import com.zh.springbootdocker.service.AreaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhangqiang
 * @date 2019-04-13
 */
@RestController
public class AreaController {

    @Resource
    AreaService areaService;

    @GetMapping("/area")
    public CommonResult getArea(Integer id) {
        AreaEntity area = areaService.findAreaById(id);
        if (area == null) {
            return CommonResult.fail(HttpStatus.NOT_FOUND);
        }
        return CommonResult.success(area);
    }

}
