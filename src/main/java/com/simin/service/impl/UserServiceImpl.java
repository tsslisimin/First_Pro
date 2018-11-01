package com.simin.service.impl;

import com.simin.dao.IUserDao;
import com.simin.domain.User;
import com.simin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//3.用户业务层实现类
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;
    @Override
    public List<User> findAllUser() {
        return userDao.findAll();
    }
}
