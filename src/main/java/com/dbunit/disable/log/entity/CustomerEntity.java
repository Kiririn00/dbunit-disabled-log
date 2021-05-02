package com.dbunit.disable.log.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Repository
public class CustomerEntity {

    int id;
    String name;
    int age;
    String address;
}
