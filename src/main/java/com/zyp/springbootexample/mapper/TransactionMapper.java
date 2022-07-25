package com.zyp.springbootexample.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author xiaoluo
 * @date 2022/7/25
 */
@Repository
public interface TransactionMapper {

    Integer update(@Param("param") String groupName);
}
