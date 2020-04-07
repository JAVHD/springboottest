package com.sbtest.service.impl;

import com.sbtest.entity.YcGoods;
import com.sbtest.dao.YcGoodsDao;
import com.sbtest.service.YcGoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 烟草商品表(YcGoods)表服务实现类
 *
 * @author makejava
 * @since 2020-04-06 00:24:21
 */
@Service("ycGoodsService")
public class YcGoodsServiceImpl implements YcGoodsService {
    @Resource
    private YcGoodsDao ycGoodsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public YcGoods queryById(Integer id) {
        return this.ycGoodsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<YcGoods> queryAllByLimit(int offset, int limit) {
        return this.ycGoodsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ycGoods 实例对象
     * @return 实例对象
     */
    @Override
    public YcGoods insert(YcGoods ycGoods) {
        this.ycGoodsDao.insert(ycGoods);
        return ycGoods;
    }

    /**
     * 修改数据
     *
     * @param ycGoods 实例对象
     * @return 实例对象
     */
    @Override
    public YcGoods update(YcGoods ycGoods) {
        this.ycGoodsDao.update(ycGoods);
        return this.queryById(ycGoods.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.ycGoodsDao.deleteById(id) > 0;
    }
}