package com.example.bigwork.Service.login;

import com.example.bigwork.entities.check;
import com.example.bigwork.entities.login;

import java.util.List;

public interface loginService {
    public login querylogin(String loginid, String password);
    public int addloginuser(String loginid,String password,String workerid);
    public int updatelogin(String loginid,String password,String workerid);
}
