package com.sbtest.service.impl;

import com.sbtest.service.QualifierTestService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/4/19 下午9:48
 * Description:
 */

@Service("QualifierT")
//@Service
public class QualifierTestServiceImpl implements QualifierTestService {

    public void test() {
        System.out.println("QualifierTestServiceImpl.test()");
    }

    //@Override
}
