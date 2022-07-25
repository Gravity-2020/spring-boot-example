package com.zyp.springbootexample.controller;

import com.zyp.springbootexample.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * springboot事务:
 * ①:引入maven依赖 mybatis-spring-boot-starter;
 * ②:在入口类中使用注解 @EnableTransactionManagement 开启事务支持;
 * ③:在访问数据库的service方法上添加注解 @Transaction 注解即可。
 * <p>
 * 测试流程:执行方法,在操作数据库之后书写报错查询,看看是否回滚,数据库未改变.
 *
 * @author xiaoluo
 * @date 2022/7/25
 */

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Resource
    private TransactionService service;

    @PostMapping("/trigger")
    public void transaction() {
        service.transactionTrigger();
    }
}
