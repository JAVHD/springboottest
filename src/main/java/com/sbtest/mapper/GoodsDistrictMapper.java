package com.sbtest.mapper;

import com.github.pagehelper.Page;
import com.sbtest.model.GoodsDistrict;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface GoodsDistrictMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsDistrict record);

    int insertSelective(GoodsDistrict record);

    GoodsDistrict selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsDistrict record);

    int updateByPrimaryKey(GoodsDistrict record);

    //列表数据
    Page<GoodsDistrict> getList();
}