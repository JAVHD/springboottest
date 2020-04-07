package com.sbtest.service;

import com.sbtest.entity.YcArticle;

import java.util.List;

/**
 * 文章(YcArticle)表服务接口
 *
 * @author makejava
 * @since 2020-04-06 09:34:28
 */
public interface YcArticleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    YcArticle queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<YcArticle> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ycArticle 实例对象
     * @return 实例对象
     */
    YcArticle insert(YcArticle ycArticle);

    /**
     * 修改数据
     *
     * @param ycArticle 实例对象
     * @return 实例对象
     */
    YcArticle update(YcArticle ycArticle);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}