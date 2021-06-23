package com.example.bigwork.Dao;

import com.example.bigwork.entities.check;
import com.example.bigwork.entities.user;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface user_dao {
    public List<user> getalluser();
    public int getusercount();
    public int adduser(user user);
    public int deluserbyid(int id);
    public int upuserbyid(user user);
    public user getuserbyid(String id);
}
