package com.sbtest.service;

import com.sbtest.entity.YcFeedback;

import java.util.List;

/**
 * 意见回复(YcFeedback)表服务接口
 *
 * @author makejava
 * @since 2020-04-06 09:27:13
 */
public interface YcFeedbackService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    YcFeedback queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<YcFeedback> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ycFeedback 实例对象
     * @return 实例对象
     */
    YcFeedback insert(YcFeedback ycFeedback);

    /**
     * 修改数据
     *
     * @param ycFeedback 实例对象
     * @return 实例对象
     */
    YcFeedback update(YcFeedback ycFeedback);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}