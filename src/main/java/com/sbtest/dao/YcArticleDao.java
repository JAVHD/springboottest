package com.sbtest.dao;

import com.sbtest.entity.YcArticle;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 文章(YcArticle)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-06 09:34:28
 */
public interface YcArticleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    YcArticle queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<YcArticle> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param ycArticle 实例对象
     * @return 对象列表
     */
    List<YcArticle> queryAll(YcArticle ycArticle);

    /**
     * 新增数据
     *
     * @param ycArticle 实例对象
     * @return 影响行数
     */
    int insert(YcArticle ycArticle);

    /**
     * 修改数据
     *
     * @param ycArticle 实例对象
     * @return 影响行数
     */
    int update(YcArticle ycArticle);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}