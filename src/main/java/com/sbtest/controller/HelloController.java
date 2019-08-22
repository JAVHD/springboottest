package com.sbtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
// @RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "HelloController中的hello方法zzz";
    }
}