package com.simin.controller;

import com.simin.domain.User;
import com.simin.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * 5.用户控制层，即和视图相互
 */
@RestController
@RequestMapping("/user")
public class UserContorller {

    private IUserService userService;
    /**
     * 业务层调用持久层
     * @return
     */
    @RequestMapping("/findAll")
    public List<User> findAllUser(){

        List<User> users =userService.findAllUser();
        return users;
    }
}
