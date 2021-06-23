package com.example.bigwork.Service.register;

import com.example.bigwork.Dao.register_dao;
import com.example.bigwork.Service.register.registerService;
import com.example.bigwork.entities.register;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class registerimpl implements registerService {

    @Autowired
    private register_dao register_dao;

    @Override
    public List<register> getregisterAll() {
        return register_dao.getregisterAll();
    }

    @Override
    public int getregistercount() {
        return register_dao.getregistercount();
    }

    @Override
    public int deleteregisterbyid(int id) {
        return register_dao.deleteregisterbyid(id);
    }

    @Override
    public int updateregister(String registerid,
                              String userid,
                              String registertime,
                              String registertype,
                              String registerpay,
                              String rdepartmentid,
                              String identityid,
                              String phone) {
        register register=new register();
        register.setRegisterid(registerid);
        register.setUsername(userid);
        register.setRdepartmentid(rdepartmentid);
        register.setRegisterpay(registerpay);
        register.setRegistertime(registertime);
        register.setRegistertype(registertype);
        register.setIdentityid(identityid);
        register.setPhone(phone);
        return register_dao.updateregister(register);
    }

    @Override
    public register getregisterbyid(int id) {
        return register_dao.getregisterbyid(id);
    }

    @Override
    public int addregister(
                           String userid,
                           String registertime,
                           String registertype,
                           String registerpay,
                           String rdepartmentid,
                           String identityid,
                           String phone) {
        register register=new register();
        register.setUsername(userid);
        register.setRdepartmentid(rdepartmentid);
        register.setRegisterpay(registerpay);
        register.setRegistertime(registertime);
        register.setRegistertype(registertype);
        register.setPhone(phone);
        register.setIdentityid(identityid);
        return register_dao.addregister(register);
    }
}
