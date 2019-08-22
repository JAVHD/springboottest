package com.sbtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/manage/goods")
public class GoodsController {

    @RequestMapping("/getList")
    public String getList() {
        return "goods getList controller";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save() {
        return "save goods";
    }
}
