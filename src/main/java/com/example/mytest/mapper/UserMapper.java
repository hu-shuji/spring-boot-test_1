package com.example.mytest.mapper;

import com.example.mytest.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;

public interface UserMapper {
    UserBean getInfo(String name,String password);
}
