package com.sbtest.controller;

import com.sbtest.entity.YcGoods;
import com.sbtest.service.YcGoodsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 烟草商品表(YcGoods)表控制层
 *
 * @author makejava
 * @since 2020-04-06 00:24:25
 */
@RestController
@RequestMapping("ycGoods")
public class YcGoodsController {
    /**
     * 服务对象
     */
    @Resource
    private YcGoodsService ycGoodsService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YcGoods selectOne(Integer id) {
        return this.ycGoodsService.queryById(id);
    }

}