package com.sbtest.controller;

import com.sbtest.service.QualifierTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    @Autowired
    //@Qualifier("QualifierT")
    @Qualifier("QualifierT")
    QualifierTestService qualifierTestService;

    @GetMapping(value = "/qualifierTest")
    public void qualifierTest() {
        qualifierTestService.test();
    }


    @GetMapping(value = "/index")
    public void index() {
        System.out.println("TestController.index()");
        long time = System.currentTimeMillis();

        System.out.println(time);
    }

}
