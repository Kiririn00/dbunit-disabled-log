package com.dbunit.disable.log.mapper;

import com.dbunit.disable.log.entity.CustomerEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CustomerMapper {
    @Select("SELECT * FROM customer;")
    List<CustomerEntity> findAll();
}
