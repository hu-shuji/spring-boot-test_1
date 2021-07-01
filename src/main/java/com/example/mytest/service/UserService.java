package com.example.mytest.service;

import com.example.mytest.bean.UserBean;

public interface UserService {
    UserBean loginIn(String name,String password);
}
