package com.sbtest.service.impl;

import com.sbtest.entity.YcFeedback;
import com.sbtest.dao.YcFeedbackDao;
import com.sbtest.service.YcFeedbackService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 意见回复(YcFeedback)表服务实现类
 *
 * @author makejava
 * @since 2020-04-06 09:27:13
 */
@Service("ycFeedbackService")
public class YcFeedbackServiceImpl implements YcFeedbackService {
    @Resource
    private YcFeedbackDao ycFeedbackDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public YcFeedback queryById(Integer id) {
        return this.ycFeedbackDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<YcFeedback> queryAllByLimit(int offset, int limit) {
        return this.ycFeedbackDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ycFeedback 实例对象
     * @return 实例对象
     */
    @Override
    public YcFeedback insert(YcFeedback ycFeedback) {
        this.ycFeedbackDao.insert(ycFeedback);
        return ycFeedback;
    }

    /**
     * 修改数据
     *
     * @param ycFeedback 实例对象
     * @return 实例对象
     */
    @Override
    public YcFeedback update(YcFeedback ycFeedback) {
        this.ycFeedbackDao.update(ycFeedback);
        return this.queryById(ycFeedback.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.ycFeedbackDao.deleteById(id) > 0;
    }
}