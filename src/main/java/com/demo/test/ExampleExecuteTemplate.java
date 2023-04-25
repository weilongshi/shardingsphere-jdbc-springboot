package com.demo.test;

import com.demo.service.impl.OrderServiceImpl;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 * @author longshiwei
 * @date 2023/04/17 14:26
 **/
@Service
public class ExampleExecuteTemplate {

    @Autowired
    private OrderServiceImpl orderService;

    @PostConstruct
    public void run() throws SQLException {


//        try {
        // 初始化表，会根据规则插入ds0 ds1 创建xx_0 xx_1 表
//            orderService.initEnvironment();
//            orderService.processSuccess();
//        } finally {
        //删除表以及数据
//            orderService.cleanEnvironment();
//        }


        // 两个库，两个表（0，1）都插入
        // orderService.initEnvironment();
        orderService.insertTest();

    }
}
