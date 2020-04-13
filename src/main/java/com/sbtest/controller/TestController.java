package com.sbtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/4/12 上午12:28
 * Description:
 */

@RestController
@RequestMapping(value = "test")
public class TestController {

    @GetMapping(value = "/index")
    public void index() {
        System.out.println("TestController.index()");
    }

}
