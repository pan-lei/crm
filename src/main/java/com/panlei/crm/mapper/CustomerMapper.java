package com.panlei.crm.mapper;

import com.panlei.crm.entity.Customer;
import org.apache.ibatis.annotations.*;

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

    @Delete("DELETE FROM customer where id=#{id, jdbcType=INTEGER}")
    void delete(int id);

    @Select("SELECT * FROM customer WHERE id=#{id, jdbcType=INTEGER}")
    Customer findCustomerById(int id);

    @Update("UPDATE customer SET name=#{name, jdbcType=VARCHAR}, age=#{age, jdbcType=INTEGER}," +
            "sex=#{sex, jdbcType=VARCHAR}, tel=#{tel, jdbcType=VARCHAR}, address=#{address, jdbcType=VARCHAR}," +
            "level=#{level, jdbcType=INTEGER}, job=#{job, jdbcType=VARCHAR} WHERE id=#{id, jdbcType=INTEGER}")
    void updateCus(Customer customer);
}
