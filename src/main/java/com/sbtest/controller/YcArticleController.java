package com.sbtest.controller;

import com.sbtest.entity.YcArticle;
import com.sbtest.service.YcArticleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 文章(YcArticle)表控制层
 *
 * @author makejava
 * @since 2020-04-06 09:34:28
 */
@RestController
@RequestMapping("ycArticle")
public class YcArticleController {
    /**
     * 服务对象
     */
    @Resource
    private YcArticleService ycArticleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YcArticle selectOne(Integer id) {
        return this.ycArticleService.queryById(id);
    }

}