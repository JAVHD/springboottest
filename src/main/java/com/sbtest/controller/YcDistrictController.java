package com.sbtest.controller;

import com.sbtest.entity.YcDistrict;
import com.sbtest.service.YcDistrictService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 省市区信息(YcDistrict)表控制层
 *
 * @author makejava
 * @since 2020-04-06 00:34:38
 */
@RestController
@RequestMapping("ycDistrict")
public class YcDistrictController {
    /**
     * 服务对象
     */
    @Resource
    private YcDistrictService ycDistrictService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YcDistrict selectOne(Integer id) {
        return this.ycDistrictService.queryById(id);
    }

}