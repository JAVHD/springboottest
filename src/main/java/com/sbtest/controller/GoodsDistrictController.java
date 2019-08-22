package com.sbtest.controller;

import com.sbtest.mapper.GoodsDistrictMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sbtest.model.GoodsDistrict;

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

    @RequestMapping(value = "/getOne/id/{id}", method = RequestMethod.GET)
    public GoodsDistrict getOne(@PathVariable("id") Integer id) {
        return goodsDistrictMapper.selectByPrimaryKey(id);
    }
}
