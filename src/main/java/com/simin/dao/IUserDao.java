package com.simin.dao;

import com.simin.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//4.用户持久层接口
@Repository("userDao")
public interface IUserDao extends JpaRepository<User, Long> {//第一个参数表示要操作哪个类，第二个表示主键的类型

    //    //查询所有用户
//    List<User> findAll();
}
