package com.panlei.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 简单的 Spring Boot项目
 * 主要练习 前后端交互
 * 实现功能：客户信息的增删改查，以及登录验证
 * 需求分析：用户角色分为 管理员与客户，这个系统是给管理员用的。
 */
@SpringBootApplication
public class CrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmApplication.class, args);
    }

}
