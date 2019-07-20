package com.panlei.crm.mapper;

import com.panlei.crm.entity.Customer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author pan_l
 * @ClassName CustomerMapper
 * @Description
 * @date 2019-07-20 17:29
 */
@Mapper
public interface CustomerMapper {

    @Select("SELECT * FROM customer")
    List<Customer> queryList();

    @Insert("INSERT INTO customer VALUES (null,#{name, jdbcType=VARCHAR}, #{age, jdbcType=INTEGER}," +
            "#{sex, jdbcType=VARCHAR}, #{tel, jdbcType=VARCHAR}, #{address, jdbcType=VARCHAR}," +
            "#{level, jdbcType=INTEGER}, #{job, jdbcType=VARCHAR})")
    void save(Customer customer);
}
