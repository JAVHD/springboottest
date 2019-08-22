package com.sbtest.mapper;

import com.sbtest.model.GoodsDistrict;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GoodsDistrictMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsDistrict record);

    int insertSelective(GoodsDistrict record);

    GoodsDistrict selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsDistrict record);

    int updateByPrimaryKey(GoodsDistrict record);
}