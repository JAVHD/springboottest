package com.sbtest.controller;

import com.sbtest.entity.YcFeedback;
import com.sbtest.service.YcFeedbackService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 意见回复(YcFeedback)表控制层
 *
 * @author makejava
 * @since 2020-04-06 09:27:13
 */
@RestController
@RequestMapping("ycFeedback")
public class YcFeedbackController {
    /**
     * 服务对象
     */
    @Resource
    private YcFeedbackService ycFeedbackService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public YcFeedback selectOne(Integer id) {
        return this.ycFeedbackService.queryById(id);
    }

}