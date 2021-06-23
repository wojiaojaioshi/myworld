package com.example.bigwork.Dao;

import com.example.bigwork.entities.login;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface login_dao {
public login querylogin(String loginid,String password);
public int addloginuser(login login);
    public int updatelogin(login login);
}
