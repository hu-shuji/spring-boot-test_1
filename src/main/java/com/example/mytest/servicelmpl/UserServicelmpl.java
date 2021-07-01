
package com.example.mytest.servicelmpl;

import com.example.mytest.bean.UserBean;
import com.example.mytest.mapper.UserMapper;
import com.example.mytest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicelmpl implements UserService {

    //将DAO注入Service层
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean loginIn(String name,String password) {
        return userMapper.getInfo(name,password);
    }
}