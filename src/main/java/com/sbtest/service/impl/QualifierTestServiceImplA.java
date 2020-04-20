package com.sbtest.service.impl;

import com.sbtest.service.QualifierTestService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/4/20 下午2:02
 * Description:
 */

@Service("QualifierTestServiceImplA")
@Primary
public class QualifierTestServiceImplA implements QualifierTestService {

    @Override
    public void test() {
        System.out.println("QualifierTestServiceImplA.test()");
    }

}
