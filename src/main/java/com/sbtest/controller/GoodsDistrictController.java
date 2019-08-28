package com.sbtest.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sbtest.mapper.GoodsDistrictMapper;
import com.sbtest.util.ApiResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.sbtest.model.GoodsDistrict;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2019-08-23 00:24
 * Description:
 */

@Controller
@ResponseBody
@RequestMapping("/manage/GoodsDistrict")
public class GoodsDistrictController {

    @Autowired
    private GoodsDistrictMapper goodsDistrictMapper;

    // @RequestMapping(value = "/getOne/id/{id}", method = RequestMethod.GET)
    // public GoodsDistrict getOne(@PathVariable("id") Integer id) {
    //     return goodsDistrictMapper.selectByPrimaryKey(id);
    // }

    @RequestMapping(value = "/getOne", method = RequestMethod.GET)
    public GoodsDistrict getOne(@RequestParam(value = "id", required = true) Integer id) {
        return goodsDistrictMapper.selectByPrimaryKey(id);
    }

    //商品列表数据
    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public Page<GoodsDistrict> getList(@RequestParam(value = "page", defaultValue = "1", required = false) Integer page,
                                       @RequestParam(value = "limit", defaultValue = "10", required = false) Integer limit) {

        PageHelper.startPage(page, limit);
        Page<GoodsDistrict> list = goodsDistrictMapper.getList();

        //return ApiResultUtil.okList(list);
        return list;
    }


}
