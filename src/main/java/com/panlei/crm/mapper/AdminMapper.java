package com.panlei.crm.mapper;

import com.panlei.crm.entity.Administor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author pan_l
 * @ClassName AdminMapper
 * @Description
 * @date 2019-07-17 15:20
 */
@Mapper
public interface AdminMapper {
    @Select("select * from administor where name = #{name} AND password = #{password}")
    Administor findAdministor(@Param("name") String name, @Param("password")String password);
}
