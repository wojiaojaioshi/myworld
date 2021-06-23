package com.example.bigwork.Service.user;

import com.example.bigwork.entities.register;
import com.example.bigwork.entities.user;

import java.util.List;

public interface userService {
    public List<user> getuserAll();
    public int getusercount();
    public int deleteuserbyid(int id);
    public int updateuser(String id,
                              String identityid,
                              String phone,
                              String username,
                          String checked,
                          String registerid,
                          String hosped,
                          String maindoctorid);
    public user getuserbyid(String id);
    public int adduser(
                       String identityid,
                       String phone,
                       String username,
                       String checked,
                       String registerid,
                       String hosped,
                       String maindoctorid);
}
