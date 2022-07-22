package com.zyp.springbootexample.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 邮件主体类
 *
 * @author xiaoluo
 * @date 2022/7/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mail {

    /**
     * 邮件接收者
     */
    private String to;

    /**
     * 邮件主题
     */
    private String subject;

    /**
     * 邮件内容
     */
    private String content;
}
