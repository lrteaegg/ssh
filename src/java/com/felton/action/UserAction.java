package com.felton.action;

import com.felton.model.User;
import com.felton.service.UserService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("userAction")
@Scope("prototype")
public class UserAction {
    private User user;

    @Resource
    private UserService userService;

    public User getUser(){
        return user;
    };

    public String m1(){
        user = userService.getUser(1);
        System.out.println(user.getName());
        return "success";
    }

    public String saveUser(){
        User user = new User();
        user.setName("事物已提交");
        userService.saveUser(user);
        return "success";
    }

}




