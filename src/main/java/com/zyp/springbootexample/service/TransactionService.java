package com.zyp.springbootexample.service;

import com.zyp.springbootexample.mapper.TransactionMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author xiaoluo
 * @date 2022/7/25
 */
@Service
public class TransactionService {

    @Resource
    private TransactionMapper mapper;

    @Transactional
    public void transactionTrigger() {
        //正常的数据库操作:比如修改。
        String groupName = "transaction";
        mapper.update(groupName);

        //这里设置个异常,使整个事务方法回滚.
        int a = 10 / 0;
    }
}
