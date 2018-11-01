package com.simin.service;

import com.simin.domain.User;

import java.util.List;

//2.用户业务层接口
public interface IUserService {

    //查询所有用户
    List<User> findAllUser();
}
