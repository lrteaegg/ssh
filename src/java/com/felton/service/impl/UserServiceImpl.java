package com.felton.service.impl;

import com.felton.dao.UserDao;
import com.felton.model.User;
import com.felton.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service("userService")
public class UserServiceImpl implements UserService {

    // 依赖Dao
    @Resource
    private UserDao userDao;
    // 注入事物
    @Transactional(rollbackFor = {Exception.class, RuntimeException.class})
    public User getUser(Integer uid) {
        return userDao.getUser(uid);
    }

    @Transactional(rollbackFor = {Exception.class, RuntimeException.class})
    public void saveUser(User user) {
        userDao.saveUser(user);
    }
}
