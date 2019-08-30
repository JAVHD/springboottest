package com.sbtest.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sbtest.mapper.GoodsDistrictMapper;
import com.sbtest.model.GoodsDistrict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2019-08-28 11:11
 * Description:
 */

@Service
public class GoodsDistrictService {

    @Autowired
    private GoodsDistrictMapper goodsDistrictMapper;

    public Page<GoodsDistrict> getList(Integer page, Integer limit) {

        PageHelper.startPage(page, limit);
        //Page<GoodsDistrict> list = goodsDistrictMapper.getList();
        return goodsDistrictMapper.getList();

    }

}
