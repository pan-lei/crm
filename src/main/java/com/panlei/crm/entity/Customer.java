package com.panlei.crm.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * @author pan_l
 * @ClassName Customer
 * @Description
 * @date 2019-07-17 15:17
 */
@Getter
@Setter
public class Customer {
    private int id;
    private String name;
    private int age;
    private String sex;
    private String tel;
    private String address;
    private int level;
    private String job;
}
