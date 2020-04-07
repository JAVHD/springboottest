package com.sbtest.dao;

import com.sbtest.entity.YcDistrict;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 省市区信息(YcDistrict)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-06 00:34:38
 */
public interface YcDistrictDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    YcDistrict queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<YcDistrict> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ycDistrict 实例对象
     * @return 对象列表
     */
    List<YcDistrict> queryAll(YcDistrict ycDistrict);

    /**
     * 新增数据
     *
     * @param ycDistrict 实例对象
     * @return 影响行数
     */
    int insert(YcDistrict ycDistrict);

    /**
     * 修改数据
     *
     * @param ycDistrict 实例对象
     * @return 影响行数
     */
    int update(YcDistrict ycDistrict);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}