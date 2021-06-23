package com.example.bigwork.Service.login;

import com.example.bigwork.Dao.login_dao;
import com.example.bigwork.entities.login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginimpl implements loginService{
    @Autowired
    private login_dao login_dao;
    @Override
    public login querylogin(String loginid, String password) {
        login login=login_dao.querylogin(loginid, password);
        return login;
    }

    @Override
    public int addloginuser(String loginid, String password, String workerid) {
        System.out.println(loginid+password+workerid);
            login login = new login();
            login.setLoginid(loginid);
            login.setPassword(password);
            login.setWorkerid(workerid);
            login_dao.addloginuser(login);
            return 1;
    }

    @Override
    public int updatelogin(String loginid, String password, String workerid) {
        System.out.println(loginid+password+workerid);
        login login = new login();
        login.setLoginid(loginid);
        login.setPassword(password);
        login.setWorkerid(workerid);
        login_dao.updatelogin(login);
        return 1;
    }
}
