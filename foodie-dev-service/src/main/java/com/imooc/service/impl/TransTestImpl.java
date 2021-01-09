package com.imooc.service.impl;

import com.imooc.service.StuService;
import com.imooc.service.TransTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransTestImpl implements TransTest {
    @Autowired
    private StuService stuService;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void testPropagationTrans() {
        stuService.saveParent();
        stuService.saveChildren();
    }
}
