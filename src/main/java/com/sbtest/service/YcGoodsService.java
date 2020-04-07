package com.sbtest.service;

import com.sbtest.entity.YcGoods;

import java.util.List;

/**
 * 烟草商品表(YcGoods)表服务接口
 *
 * @author makejava
 * @since 2020-04-06 00:24:21
 */
public interface YcGoodsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    YcGoods queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<YcGoods> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ycGoods 实例对象
     * @return 实例对象
     */
    YcGoods insert(YcGoods ycGoods);

    /**
     * 修改数据
     *
     * @param ycGoods 实例对象
     * @return 实例对象
     */
    YcGoods update(YcGoods ycGoods);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}