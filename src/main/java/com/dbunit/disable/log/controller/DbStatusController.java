package com.dbunit.disable.log.controller;

import com.dbunit.disable.log.entity.CustomerEntity;
import com.dbunit.disable.log.mapper.CustomerMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DbStatusController {

    private final CustomerMapper customerMapper;

    DbStatusController(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }

    @GetMapping("/select")
    public List<CustomerEntity> selectTargetData() {
        return customerMapper.findAll();
    }
}
