package com.example.bigwork.Service.user;

import com.example.bigwork.Dao.user_dao;
import com.example.bigwork.Dao.worker_dao;
import com.example.bigwork.entities.register;
import com.example.bigwork.entities.user;
import com.example.bigwork.entities.worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class userimpl implements userService{
    @Autowired
    private user_dao  user_dao;
    @Autowired
    private worker_dao worker_dao;

    @Override
    public List<user> getuserAll() {
        return user_dao.getalluser();
    }

    @Override
    public int getusercount() {
        return user_dao.getusercount();
    }

    @Override
    public int deleteuserbyid(int id) {
        return user_dao.deluserbyid(id);
    }

    @Override
    public int updateuser(String id, String identityid, String phone, String username,String checked,String registerid,String hosped,
                          String maindoctorid) {

        user user=new user();
        user.setId(id);
        user.setIdentityid(identityid);
        user.setPhone(phone);
        user.setUsername(username);
        user.setChecked(checked);
        user.setRegisterid(registerid);
        user.setMaindoctorid(maindoctorid);
        user.setHosped(hosped);
        return user_dao.upuserbyid(user);
    }

    @Override
    public user getuserbyid(String id) {
        return user_dao.getuserbyid(id);
    }

    @Override
    public int adduser( String identityid, String phone, String username,String checked,String registerid,String hosped,
                        String maindoctorid) {
        user user=new user();
        user.setIdentityid(identityid);
        user.setPhone(phone);
        user.setUsername(username);
        user.setChecked(checked);
        user.setRegisterid(registerid);
        user.setMaindoctorid(maindoctorid);
        user.setHosped(hosped);
        return user_dao.adduser(user);
    }
}
