package com.sbtest.service.impl;

import com.sbtest.entity.YcDistrict;
import com.sbtest.dao.YcDistrictDao;
import com.sbtest.service.YcDistrictService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 省市区信息(YcDistrict)表服务实现类
 *
 * @author makejava
 * @since 2020-04-06 00:34:38
 */
@Service("ycDistrictService")
public class YcDistrictServiceImpl implements YcDistrictService {
    @Resource
    private YcDistrictDao ycDistrictDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public YcDistrict queryById(Integer id) {
        return this.ycDistrictDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<YcDistrict> queryAllByLimit(int offset, int limit) {
        return this.ycDistrictDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ycDistrict 实例对象
     * @return 实例对象
     */
    @Override
    public YcDistrict insert(YcDistrict ycDistrict) {
        this.ycDistrictDao.insert(ycDistrict);
        return ycDistrict;
    }

    /**
     * 修改数据
     *
     * @param ycDistrict 实例对象
     * @return 实例对象
     */
    @Override
    public YcDistrict update(YcDistrict ycDistrict) {
        this.ycDistrictDao.update(ycDistrict);
        return this.queryById(ycDistrict.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.ycDistrictDao.deleteById(id) > 0;
    }
}