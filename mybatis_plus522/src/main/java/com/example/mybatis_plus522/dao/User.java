package com.example.mybatis_plus522.dao;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;

    public User() {

    }
}