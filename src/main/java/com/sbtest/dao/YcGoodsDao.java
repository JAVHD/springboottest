package com.sbtest.dao;

import com.sbtest.entity.YcGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 烟草商品表(YcGoods)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-06 00:24:18
 */
public interface YcGoodsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    YcGoods queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<YcGoods> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ycGoods 实例对象
     * @return 对象列表
     */
    List<YcGoods> queryAll(YcGoods ycGoods);

    /**
     * 新增数据
     *
     * @param ycGoods 实例对象
     * @return 影响行数
     */
    int insert(YcGoods ycGoods);

    /**
     * 修改数据
     *
     * @param ycGoods 实例对象
     * @return 影响行数
     */
    int update(YcGoods ycGoods);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}