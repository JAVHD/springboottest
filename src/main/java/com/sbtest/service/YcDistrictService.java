package com.sbtest.service;

import com.sbtest.entity.YcDistrict;

import java.util.List;

/**
 * 省市区信息(YcDistrict)表服务接口
 *
 * @author makejava
 * @since 2020-04-06 00:34:38
 */
public interface YcDistrictService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    YcDistrict queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<YcDistrict> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ycDistrict 实例对象
     * @return 实例对象
     */
    YcDistrict insert(YcDistrict ycDistrict);

    /**
     * 修改数据
     *
     * @param ycDistrict 实例对象
     * @return 实例对象
     */
    YcDistrict update(YcDistrict ycDistrict);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}